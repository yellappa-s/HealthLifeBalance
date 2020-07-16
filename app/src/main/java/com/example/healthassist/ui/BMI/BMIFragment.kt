package com.example.healthassist.ui.BMI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.healthassist.R
import kotlinx.android.synthetic.main.fragment_gallery.*

class BMIFragment : Fragment() {

    private lateinit var galleryViewModel: BMIViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProviders.of(this).get(BMIViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            calc.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    calculateBMI()
                }
            })
        })
        return root
    }

    fun calculateBMI() {
        val heightStr = height.text.toString()
        val weightStr = weight.text.toString()
        if(!"".equals(heightStr) && !"".equals(weightStr)) {
            val heightValue = heightStr.toFloat() / 100
            val weightValue = weightStr.toFloat()
            val bmi = weightValue / (heightValue * heightValue)
            displayBMI(bmi)
        } else {
            Toast.makeText(context, "Please enter values", Toast.LENGTH_SHORT).show()
        }
    }

    private fun displayBMI(bmi: Float) {
        var bmiLabel: String
        bmiLabel = if (java.lang.Float.compare(bmi, 15f) <= 0) {
            getString(R.string.very_severely_underweight)
        } else if (java.lang.Float.compare(bmi, 15f) > 0 && java.lang.Float.compare(bmi, 16f) <= 0) {
            getString(R.string.severely_underweight)
        } else if (java.lang.Float.compare(bmi, 16f) > 0 && java.lang.Float.compare(bmi, 18.5f) <= 0) {
            getString(R.string.underweight)
        } else if (java.lang.Float.compare(bmi, 18.5f) > 0 && java.lang.Float.compare(bmi, 25f) <= 0) {
            getString(R.string.normal)
        } else if (java.lang.Float.compare(bmi, 25f) > 0 && java.lang.Float.compare(bmi, 30f) <= 0) {
            getString(R.string.overweight)
        } else if (java.lang.Float.compare(bmi, 30f) > 0 && java.lang.Float.compare(bmi, 35f) <= 0) {
            getString(R.string.obese_class_i)
        } else if (java.lang.Float.compare(bmi, 35f) > 0 && java.lang.Float.compare(bmi, 40f) <= 0) {
            getString(R.string.obese_class_ii)
        } else {
            getString(R.string.obese_class_iii)
        }
        bmiLabel = "$bmi\n$bmiLabel"
        result.setText(bmiLabel)
    }
}

