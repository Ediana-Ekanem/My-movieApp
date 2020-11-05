package com.example.edys_movie_project.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.edys_movie_project.R
import kotlinx.android.synthetic.main.fragment_home_screen.view.*
import kotlinx.android.synthetic.main.fragment_home_screen.view.imageView
import kotlinx.android.synthetic.main.rv_image_item.view.*

class ImageAdapter(val images : List<Int>) : RecyclerView.Adapter<ImageAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_image_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val image = images[position]
        holder.itemView.image_view.setImageResource(image)
    }

    override fun getItemCount(): Int {

        return images.size
    }


}