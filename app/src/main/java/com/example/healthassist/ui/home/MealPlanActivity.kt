package com.example.healthassist.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.healthassist.R

class MealPlanActivity : AppCompatActivity() {
    var image1:ImageView? = null
    var image2:ImageView? = null
    var image3:ImageView? = null
    var image4:ImageView? = null
    var image5:ImageView? = null
    var image6:ImageView? = null
    var image7:ImageView? = null
    companion object{
        public lateinit var D_name :String
    }
    //lateinit var Dname:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_plan)
         image1 = findViewById(R.id.healthyp)
         image2 = findViewById(R.id.daib)
         image3 = findViewById(R.id.bp)
         image4 = findViewById(R.id.heartp)
         image5 = findViewById(R.id.gastric)
         image6 = findViewById(R.id.weightloss)
         image7 = findViewById(R.id.weightgain)

        image1?.setOnClickListener {
            val intent = Intent(this, ExampleTwo::class.java)
            D_name= "Normal Person"
            startActivity(intent)
        }
        image2?.setOnClickListener{
            val intent = Intent(this, ExampleTwo::class.java)
            D_name= "Diabetes"
            startActivity(intent)
        }
        image3?.setOnClickListener {
            val intent = Intent(this, ExampleTwo::class.java)
            D_name = "Blood Pressure"
            startActivity(intent)
        }
        image4?.setOnClickListener {
            val intent = Intent(this, ExampleTwo::class.java)
            D_name = "Heart Problem"
            startActivity(intent)
        }
        image5?.setOnClickListener {
            val intent = Intent(this, ExampleTwo::class.java)
            D_name = "Acidity"
            startActivity(intent)
        }
        image6?.setOnClickListener {
            val intent = Intent(this, ExampleTwo::class.java)
            D_name = "Weight Loss"
            startActivity(intent)
        }
        image7?.setOnClickListener {
            val intent = Intent(this, ExampleTwo::class.java)
            D_name = "Weight Gain"
            startActivity(intent)
        }

    }
}