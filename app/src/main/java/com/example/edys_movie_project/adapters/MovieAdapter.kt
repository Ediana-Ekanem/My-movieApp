package com.example.edys_movie_project.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.edys_movie_project.MovieItems
import com.example.edys_movie_project.R
import kotlinx.android.synthetic.main.fragment_home_screen.view.*
import kotlinx.android.synthetic.main.movie_items.view.*

class MovieAdapter(private val movieList: List<MovieItems>) :RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_items,parent,false)
        return MovieViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
       val currentItem = movieList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.text1
    }



    inner class MovieViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.movie_image_view
        val textView : TextView = itemView.movie_text_view



           // navigation
        init {
            itemView.setOnClickListener {
                it.findNavController().navigate(R.id.action_homeScreen_to_secondScreen)
            }
        }
    }



    override fun getItemCount() = movieList.size
}