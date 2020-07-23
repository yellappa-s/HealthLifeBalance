package com.example.healthassist.ui.mymap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthassist.R

class ListActivity : AppCompatActivity() {

    private lateinit var rview:RecyclerView
    private lateinit var txtPlace:TextView
    private lateinit var vadapter:RecyclerView.Adapter<*>
    private lateinit var vlayoutM:RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var typePlace = intent.getStringExtra("typePlace")

        txtPlace = findViewById(R.id.txtPlace)
        rview = findViewById<RecyclerView>(R.id.r_view)
        rview.setHasFixedSize(true)

        vlayoutM = LinearLayoutManager(this)
        vadapter = listAdapter(MapsActivity.myData)


        if(typePlace=="hospital"){
            txtPlace.text = "NEARBY  HOSPITALS"
        }
        if(typePlace=="pharmacy"){
            txtPlace.text = "NEARBY  PHARMACIES"
        }

        rview.layoutManager=vlayoutM
        rview.adapter=vadapter

    }
}