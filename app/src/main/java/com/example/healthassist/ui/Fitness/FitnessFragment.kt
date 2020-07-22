package com.example.healthassist.ui.Fitness

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.healthassist.R
import kotlinx.android.synthetic.main.fragment_fitness.*
import java.sql.Array

class FitnessFragment : Fragment() , SensorEventListener {
    private var running = false
    private var total = 0f
    private var previoustotal = 0f
    private var sensorManager: SensorManager? = null
    val tableLayout:TableLayout? = null
    var days = {"Sun";"Mon";"Tue";"Wed";"Thru";"Fri";"Sat"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sensorManager =
            this.activity?.getSystemService(Activity.SENSOR_SERVICE) as SensorManager
        loaddata()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val lp = TableLayout.LayoutParams(MATCH_PARENT,150)
        tableLayout?.apply {
            layoutParams = lp
            isShrinkAllColumns = true
        }
        createTable(2,6)
        return inflater.inflate(R.layout.fragment_fitness, container, false)
    }

    @SuppressLint("SetTextI18n")
    private fun createTable(rows: Int, cols: Int) {
        for (i in 0 until rows) {
            val row = TableRow(context)
            row.layoutParams=ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)

            for (j in 0 until cols) {
                if(i == 0) {
                    val day = TextView(context)
                    day.apply {
                        layoutParams = TableRow.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                        text = "$days(j)"
                    }
                }
                if(i == 1) {
                    val st = ImageView(context)
                    st.apply {
                        layoutParams = TableRow.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                        st.setImageResource(R.drawable.ic_done)
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        running = true
        val stepsSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

        if (stepsSensor == null) {
            Toast.makeText(context, "No Step Counter Sensor !", Toast.LENGTH_SHORT).show()
        } else {
            sensorManager?.registerListener(this, stepsSensor, SensorManager.SENSOR_DELAY_UI)
        }
    }

    override fun onPause() {
        super.onPause()
        running = false
        saveData()
    }

    override fun onDestroy() {
        super.onDestroy()
        super.onPause()
        running = false
        sensorManager?.unregisterListener(this)
        saveData()
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
    }

    @SuppressLint("SetTextI18n")
    override fun onSensorChanged(event: SensorEvent) {
        if (running) {
            total = event.values[0]
            val currentSteps = total.toInt() - previoustotal.toInt()
            steptaken.text = ""+currentSteps
            progress_circular.apply {
                setProgressWithAnimation(currentSteps.toFloat())
            }
            calorie.text = "%.2f".format(currentSteps*0.045)
            km.text = "%.2f".format(currentSteps*0.0008)
        }
    }

    private fun saveData() {
        val sharedPreferences = activity?.getSharedPreferences("myprefs",Context.MODE_PRIVATE)
        val editor = sharedPreferences?.edit()
        if(previoustotal == 0f){
            editor?.putFloat("steps",total)
        } else
            editor?.putFloat("steps",previoustotal)
        editor?.apply()
    }
    private fun loaddata() {
        val sharedPreferences = activity?.getSharedPreferences("myprefs",Context.MODE_PRIVATE)
        val savenum = sharedPreferences?.getFloat("steps",0f)
        previoustotal = savenum!!
    }
}
