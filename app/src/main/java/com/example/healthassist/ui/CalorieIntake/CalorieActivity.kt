package com.example.healthassist.ui.CalorieIntake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.healthassist.R

class CalorieActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener {
    private var button: Button? = null
    internal var radioGroup: RadioGroup? = null
    internal var radioButton: RadioButton? = null

    internal var TDEE: Float = 0.toFloat()
    internal var BMR: Float = 0.toFloat()
    internal var x: Float = 0.toFloat()
    internal var L: Float = 0.toFloat()
    internal var spin: Spinner? = null
    lateinit var edtWeight: EditText
    lateinit var edtHeight: EditText
    lateinit var edtAge: EditText
    internal var spin_val: String? = null
    internal var gender = arrayOf("choose", "Male", "Female")//array of strings used to populate the spinner
    lateinit var spinner: Spinner
    var calorie: Double = 0.toDouble()
    var protein: Double = 0.toDouble()
    var fats: Double = 0.toDouble()
    var carbs: Double = 0.toDouble()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calorie)
        spinner = findViewById(R.id.spinner1)
        edtAge = findViewById(R.id.b)
        edtHeight = findViewById(R.id.d)
        edtWeight = findViewById(R.id.f)
        val adapter = ArrayAdapter.createFromResource(this, R.array.Gender, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.setAdapter(adapter)
        spinner.setOnItemSelectedListener(this)
        button = findViewById<View>(R.id.button) as Button
        button!!.setOnClickListener { openActivity() }
    }

    fun openActivity() {
        val intent = Intent(this, Calorie2Activity::class.java)
        intent.putExtra("calorie", calorie)
        intent.putExtra("Protein", protein)
        intent.putExtra("Fats", fats)
        intent.putExtra("Carbohydrates", carbs)
        startActivity(intent)
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        val text = parent.getItemAtPosition(position).toString()
        compute(text)
        //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}
    fun compute(gen: String) {
        val heightStr = edtHeight!!.text.toString()
        val weightStr = edtWeight!!.text.toString()
        val AgeStr = edtAge!!.text.toString()
        if ("" != heightStr && "" != weightStr) {
            val heightValue = heightStr.toFloat() / 100
            val weightValue = weightStr.toFloat()
            val agevalue = AgeStr.toFloat()
            if (gen == "Female") {
                calorie = ((655.1 + 9.6 * weightValue + 1.9 * heightValue - 4.7 * agevalue) * L)
            } else if (gen == "Male") {
                calorie = ((66.5 + 13.7 * weightValue + 5.0 * heightValue - 4.7 * agevalue) * L)
                if (calorie == 0.0) {
                    calorie = 1200.0
                }
            }
            TDEE = (1.2 * calorie).toFloat()
            protein = (heightValue * 0.8)
            if (protein == 0.0) {
                protein = 0.8
            }
            fats = (0.2 * TDEE).toFloat() / 9.toDouble()
            carbs = (TDEE - (protein + fats) / 9)
        }
    }

    fun checkButton(view: View) {
        // Is the button now checked?
        val checked = (view as RadioButton).isChecked
        when (view.getId()) {
            R.id.RD1 -> if (checked) L = 1.2.toFloat()
            R.id.RD2 -> if (checked) L = 1.375.toFloat()
            R.id.RD3 -> if (checked) L = 1.55.toFloat()
            R.id.RD4 -> if (checked) L = 1.725.toFloat()
            R.id.RD5 -> if (checked) L = 1.9.toFloat()
        }
        /* return L ; */
    }
}
