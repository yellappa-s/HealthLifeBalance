package com.example.healthassist.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.healthassist.R

class ChoiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        val imageview4=findViewById<ImageView>(R.id.imageview4)
        val imageview5=findViewById<ImageView>(R.id.imageview5)
        imageview4.setOnClickListener() {
            val intent = Intent(this, YogaActivity::class.java)
            startActivity(intent)
        }
        imageview5.setOnClickListener() {
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }
    }
}