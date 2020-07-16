package com.example.healthassist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.healthassist.ui.home.ExampleActivity.Companion.INTENT_PARCELABLE
import com.example.healthassist.ui.home.ExampleTwo
import com.example.healthassist.ui.home.ExampleTwo.Companion.INTENT_PARCELABLE
import com.example.healthassist.ui.home.Image
import com.example.healthassist.ui.home.Images
import com.example.healthassist.ui.home.exampleOne.Companion.INTENT_PARCELABLE

class MealPlanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_plan)
        this.setTitle("Meal Plan")

        val image = intent.getParcelableExtra<Images>(ExampleTwo.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id._imageDetail)
        val imgTitle = findViewById<TextView>(R.id._imageTitle)
        val imgDesc = findViewById<TextView>(R.id._imageDesc)

        imgSrc.setImageResource(image.imageSrc)
        imgTitle.text = image.imageTitle
        imgDesc.text = image.imageDesc
    }
}
