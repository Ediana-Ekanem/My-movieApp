package com.example.edys_movie_project.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.edys_movie_project.MovieItems
import com.example.edys_movie_project.R
import com.example.edys_movie_project.adapters.MovieAdapter
import kotlinx.android.synthetic.main.fragment_movies.*


class Shows : Fragment(R.layout.fragment_shows) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movieList = generateDummyList(10)
        movie_recycler_view.adapter = MovieAdapter(movieList)
        movie_recycler_view.layoutManager =
            GridLayoutManager(requireContext(), 1, GridLayoutManager.HORIZONTAL, false)
        movie_recycler_view.setHasFixedSize(true)


        val movieListTwo = generateDummyList(10)
        movie_recycler_view_two.adapter = MovieAdapter(movieListTwo)
        movie_recycler_view_two.layoutManager =
            GridLayoutManager(requireContext(), 1, GridLayoutManager.HORIZONTAL, false)
        movie_recycler_view_two.setHasFixedSize(true)
    }



    private fun generateDummyList(size: Int): List<MovieItems> {
        val list = ArrayList<MovieItems>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.deadpool
                1 -> R.drawable.notime
                else -> R.drawable.shaft
            }

            val item = MovieItems(drawable, "Item $i")
            list += item
        }

        return list
    }
}
