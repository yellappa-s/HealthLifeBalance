package com.example.healthassist.ui.mymap

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.healthassist.R
import kotlin.collections.ArrayList

class listAdapter(private val placeList: ArrayList<place>) :
    RecyclerView.Adapter<listAdapter.placeViewHolder>() {

    class placeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.txtName)
        var address: TextView = itemView.findViewById(R.id.txtPlaceAdd)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): placeViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.single_row, parent, false)
        return placeViewHolder(v)
    }

    override fun onBindViewHolder(holder: placeViewHolder, position: Int) {
        val currentItem = placeList.get(position)
        holder.name.text = currentItem.getName()
        holder.address.text = currentItem.getAddr()
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

}
