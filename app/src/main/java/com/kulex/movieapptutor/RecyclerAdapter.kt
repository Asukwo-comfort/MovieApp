package com.kulex.movieapptutor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerAdapter (val movies: List<Movie>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
inner class ViewHolder(item: View): RecyclerView.ViewHolder(item){
    init {
        itemView.setOnClickListener{
            itemView.findNavController().navigate(R.id.action_mainFragment_to_detailsFragment)
        }
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val image = movies[position].image
        val name = movies[position].name

        holder.itemView.rv_img.setImageResource(image)
        holder.itemView.rv_name.text = name

    }
}