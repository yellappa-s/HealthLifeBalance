package com.example.healthassist.ui.Prediction

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.healthassist.R
import com.example.healthassist.ui.mymap.MapsActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    var map: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val max = intent.getIntExtra("max", 0)
        val c = intent.getIntArrayExtra("c")
        map = findViewById(R.id.bt_map)
        map?.setOnClickListener{ nextactivity()}
        if (max == c[0]) {
            result.setText("Diarrhoea")
        } else if (max == c[1]) {
            result.setText("Malaria")
        } else if (max == c[2]) {
            result.setText("Typhoid")
        } else if (max == c[3]) {
            result.setText("Diabetes")
        } else if (max == c[4]) {
            result.setText("Blood Pressure")
        } else if (max == c[5]) {
            result.setText("Heart Disease")
        } else if (max == c[6]) {
            result.setText("COVID-19")
        }
    }
  private fun nextactivity() {
     var mapintent = Intent(this, MapsActivity()::class.java)
      startActivity(mapintent)
  }

}
