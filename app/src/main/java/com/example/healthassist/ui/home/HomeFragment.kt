package com.example.healthassist.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.healthassist.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            val imageview1 = view?.findViewById<ImageView>(R.id.imageview1)
            val imageview2 = view?.findViewById<ImageView>(R.id.imageview2)
            val imageview3 = view?.findViewById<ImageView>(R.id.imageview3)
            val imageview4 = view?.findViewById<ImageView>(R.id.imageview4)
            imageview1?.setOnClickListener {
                val intent = Intent(context, ExampleActivity::class.java)
                startActivity(intent)
            }
            imageview2?.setOnClickListener {
                val intent = Intent(context, exampleOne::class.java)
                startActivity(intent)
            }
            imageview3?.setOnClickListener {
                val intent = Intent(context, YogaActivity::class.java)
                startActivity(intent)
            }
            imageview4?.setOnClickListener {
                val intent = Intent(context, ExampleTwo::class.java)
                startActivity(intent)
            }
        })
        return root
    }
}
