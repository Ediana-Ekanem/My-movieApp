package com.example.edys_movie_project.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.edys_movie_project.fragments.Drama
import com.example.edys_movie_project.fragments.Movies
import com.example.edys_movie_project.fragments.Shows

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {


        when (position) {
            0 -> (return Movies())
            1 -> (return Shows())
            2 -> (return Drama())
            else -> (return Movies())

        }

    }


    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return "Movies"
            }
            1 -> {
                return "Shows"
            }
            2 -> {
                return "Drama"
            }


        }


        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return 3
    }


}