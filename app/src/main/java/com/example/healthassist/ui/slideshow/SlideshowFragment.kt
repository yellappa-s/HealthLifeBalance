package com.example.healthassist.ui.slideshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.healthassist.R
import kotlinx.android.synthetic.main.fragment_slideshow.*
import java.util.*

class SlideshowFragment : Fragment(),AdapterView.OnItemClickListener {
    private var listsymp:ListView ? = null
    private var arrayAdapter:ArrayAdapter<String> ? = null
    private lateinit var slideshowViewModel: SlideshowViewModel
    var d = ArrayList<String>()
    var diarrhoea = arrayOf("Stomach Ache", "Nausea", "Vomiting", "Fever", "Sudden Weight Loss")
    var malaria = arrayOf("Fever", "Vomiting", "Sweating", "Muscle And Body Pain", "Headaches")
    var typhoid = arrayOf("Headaches", "Weakness/Fatigue", "Abdominal Pain", "Muscle Pain", "Dry Cough", "Diarrhoea/Constipation")
    var diabetes = arrayOf("Frequent Urination", "Hunger", "Thirsty Than Usual", "Sudden Weight Loss", "Blurred Vision", "Skin Itching")
    var blood_pressure = arrayOf("Headaches", "Blurred Vision", "Chest Pain", "Shortness in Breath", "Dizziness", "Nausea", "Vomiting")
    var cardio_disease = arrayOf("Shortness in Breath", "Fast Heartbeat", "Indigestion", "Pressure Or Heaviness In Chest", "Anxiety")
    var covid_19  = arrayOf("Fever","Dry Cough","Weakness/Fatigue","Shortness in Breath","Muscle And Body Pain", "Headaches")

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {

            listsymp = view?.findViewById(R.id.symplist)
            arrayAdapter = context?.let { it1 -> ArrayAdapter(it1,android.R.layout.simple_list_item_multiple_choice,resources.getStringArray(R.array.symptom_list)) }
            listsymp?.adapter = arrayAdapter
            listsymp?.choiceMode = ListView.CHOICE_MODE_MULTIPLE
            listsymp?.onItemClickListener = this
            disease.setOnClickListener({ display() })
        })
        return root
    }
    private fun display() {
        if (d.size < 3) Toast.makeText(context, "Please select minimum 3 symptoms", Toast.LENGTH_SHORT).show()
        else {
            val c = IntArray(7)
            for (i in d.indices) {
                for (j in 1..7) {
                    when (j) {
                        1 -> {
                            for (s in diarrhoea) {
                                if (d[i] == s) {
                                    c[0]++
                                }
                            }
                        }
                        2 -> {
                            for (s in malaria) {
                                if (d[i] == s) {
                                    c[1]++
                                }
                            }
                        }
                        3 -> {
                            for (s in typhoid) {
                                if (d[i] == s) {
                                    c[2]++
                                }
                            }
                        }
                        4 -> {
                            for (s in diabetes) {
                                if (d[i] == s) {
                                    c[3]++
                                }
                            }
                        }
                        5 -> {
                            for (s in blood_pressure) {
                                if (d[i] == s) {
                                    c[4]++
                                }
                            }
                        }
                        6 -> {
                            for (s in cardio_disease) {
                                if (d[i] == s) {
                                    c[5]++
                                }
                            }
                        }
                        7 -> {
                            for (s in covid_19) {
                                if (d[i] == s) {
                                    c[6]++
                                }
                            }
                        }
                    }
                }
            }
            var max = c[0]
            for (m in 0..5) {
                if (c[m] > max) max = c[m]
            }
            val result = Intent(context, ResultActivity::class.java)
            result.putExtra("max", max)
            result.putExtra("c", c)
            startActivity(result)
        }
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val s = parent?.getItemAtPosition(position) as String
        val v = view as CheckedTextView
        if (d.size > 5) {
            Toast.makeText(context, "please select max 5 symptoms", Toast.LENGTH_SHORT).show()
        }else {
            if (v.isChecked && !d.contains(s)) d.add(s)
            else if (!v.isChecked && d.contains(s)) d.remove(s)
        }

    }
}
