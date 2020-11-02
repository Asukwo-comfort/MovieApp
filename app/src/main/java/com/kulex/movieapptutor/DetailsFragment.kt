package com.kulex.movieapptutor

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : Fragment(R.layout.fragment_details) {

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

        rv_details.adapter = RecyclerAdapter(movies)
    }
}
