package com.kulex.movieapptutor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_movies.*

class Drama : Fragment(R.layout.fragment_movies) {

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