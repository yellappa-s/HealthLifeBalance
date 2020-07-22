package com.example.healthassist.ui.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthassist.R

class ExampleTwo : AppCompatActivity() {

    companion object{
        lateinit var D_num:String
    }
    public lateinit var DSname:String

    // lateinit  var Day_num:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_two)
        val button1 =findViewById<Button>(R.id.button1)
        val button2 =findViewById<Button>(R.id.button2)
        val button3 =findViewById<Button>(R.id.button3)
        val button4 =findViewById<Button>(R.id.button4)
        val button5 =findViewById<Button>(R.id.button5)
        val button6 =findViewById<Button>(R.id.button6)
        val button7 =findViewById<Button>(R.id.button7)

        button1.setOnClickListener() {
            D_num="1"
            val intent2 = Intent(this, Activity3::class.java)
            startActivity(intent2)
        }
        button2.setOnClickListener() {
            D_num="2"
            val intent2 = Intent(this, Activity3::class.java)
            startActivity(intent2)
        }
        button3.setOnClickListener() {
            D_num="3"
            val intent2 = Intent(this, Activity3::class.java)
            startActivity(intent2)
        }
        button4.setOnClickListener() {
            D_num="4"
            val intent2 = Intent(this, Activity3::class.java)
            startActivity(intent2)
        }
        button5.setOnClickListener() {
            D_num="5"
            val intent2 = Intent(this, Activity3::class.java)
            startActivity(intent2)
        }
        button6.setOnClickListener() {
            D_num="6"
            val intent2 = Intent(this, Activity3::class.java)
            startActivity(intent2)
        }
        button7.setOnClickListener() {
            D_num="7"
            val intent2 = Intent(this, Activity3::class.java)
            startActivity(intent2)
        }

    }

}