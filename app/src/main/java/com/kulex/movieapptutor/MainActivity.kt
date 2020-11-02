package com.kulex.movieapptutor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragList: List<Fragment> = listOf<Fragment>(Drama(), Movies(), Shows())
        val images = listOf<Int>(R.drawable.aqua, R.drawable.first_aqua, R.drawable.aquaman)

        aquaman_viewpager.adapter = RVAdapter(images)
        sec_viewpager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, fragList)


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