package com.example.healthassist.ui.CalorieIntake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.healthassist.R

class Calorie2Activity : AppCompatActivity() {
    private val buttonhome: Button? = null
    lateinit var txtCalorie: TextView
    lateinit var txtProtein: TextView
    lateinit var txtfats: TextView
    lateinit var txtcarbs: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calorie2)
        supportActionBar!!.title = "Daily Goals"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val intent = intent
        txtCalorie = findViewById(R.id.txtCal)
        txtProtein = findViewById(R.id.txtP)
        txtfats = findViewById(R.id.txtf)
        txtcarbs = findViewById(R.id.txtc)
        val cal = intent.getDoubleExtra("calorie", 1400.0)
        txtCalorie.setText("CALORIE INTAKE : " + cal + "cal")
        val pro = intent.getDoubleExtra("Protein", 0.8)
        txtProtein.setText("Protein INTAKE : " + pro + "g")
        val fat = intent.getDoubleExtra("Fats", 40.0)
        txtfats.setText("Fat INTAKE : " + fat + "g")
        val CB = intent.getDoubleExtra("Carbohydrates", 0.0)
        txtcarbs.setText("Carbohydrates INTAKE : " + CB + "g")
    }
}