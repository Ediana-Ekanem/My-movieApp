package com.example.edys_movie_project.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.edys_movie_project.R
import com.example.edys_movie_project.adapters.ImageAdapter
import com.example.edys_movie_project.adapters.PageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_home_screen.*


class HomeScreen : Fragment(R.layout.fragment_home_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        val pager = view.findViewById(R.id.firstViewPager) as ViewPager
//        val adapter: ImageAdapter = PhotosAdapter(childFragmentManager, photosUrl)
//        pager.adapter = adapter
//
//        val tabLayout = view.findViewById(R.id.tab_layout) as TabLayout
//        tabLayout.setupWithViewPager(pager, true)


        val images = listOf<Int>(R.drawable.aquaman2, R.drawable.shaft, R.drawable.jumanji, R.drawable.joker)
        firstViewPager.adapter = ImageAdapter(images)
        TabLayoutMediator(tabLayout2,firstViewPager){tab,position->

        }.attach()


        second_ViewPager.adapter = PageAdapter(childFragmentManager)
        tabLayout.setupWithViewPager(second_ViewPager)

    }
}
