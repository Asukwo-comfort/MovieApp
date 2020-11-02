package com.kulex.movieapptutor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*


class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragList: List<Fragment> = listOf<Fragment>(Drama(), Movies(), Shows())
        val images = listOf<Int>(R.drawable.aqua, R.drawable.first_aqua, R.drawable.aquaman)

        aquaman_viewpager.adapter = RVAdapter(images)
        sec_viewpager.adapter = ViewPagerAdapter(childFragmentManager, lifecycle, fragList)


        TabLayoutMediator(tab_layout1, aquaman_viewpager) { _, _ ->

        }.attach()


        TabLayoutMediator(tab_layout2, sec_viewpager) { tab, position ->

            when (position) {
                0 -> tab.text = "Movies"
                1 -> tab.text = "Shows"
                2 -> tab.text = "Drama"
            }
        }.attach()
    }
}