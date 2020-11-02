package com.kulex.movieapptutor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.GridLayout.HORIZONTAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_movies.*

class Movies : Fragment(R.layout.fragment_movies) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movies: List<Movie> = listOf(
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua),
            Movie("Movie Name", R.drawable.aqua)
        )

        rv1.adapter = RecyclerAdapter(movies)


        rv2.adapter = RecyclerAdapter(movies)
    }
}