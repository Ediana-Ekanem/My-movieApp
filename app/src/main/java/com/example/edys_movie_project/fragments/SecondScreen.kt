package com.example.edys_movie_project.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.edys_movie_project.MovieItems
import com.example.edys_movie_project.R
import com.example.edys_movie_project.adapters.MovieAdapter
import kotlinx.android.synthetic.main.fragment_second_screen.*


class SecondScreen : Fragment(R.layout.fragment_second_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


  // navigate up button to another fragment
       tool_Bar.setNavigationOnClickListener {
           it.findNavController().navigateUp()
       }

        val movieList = generateDummyList(10)
        second_screen_recycler_view.adapter = MovieAdapter(movieList)
        second_screen_recycler_view.layoutManager =
            GridLayoutManager(requireContext(), 1, GridLayoutManager.HORIZONTAL, false)
        second_screen_recycler_view.setHasFixedSize(true)
    }
    private fun generateDummyList(size: Int): List<MovieItems> {
        val list = ArrayList<MovieItems>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.thor
                1 -> R.drawable.joker
                else -> R.drawable.notime
            }

            val item = MovieItems(drawable, "Item $i")
            list += item
        }

        return list
    }
}
