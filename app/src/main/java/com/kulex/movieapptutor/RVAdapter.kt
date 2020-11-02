package com.kulex.movieapptutor

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.aquaman_img.view.*

class RVAdapter(private val images:List<Int>):
    RecyclerView.Adapter<RVAdapter.RVViewHolder>() {

        inner class RVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            init {
                itemView.setOnClickListener{
                    itemView.findNavController().navigate(R.id.action_mainFragment_to_detailsFragment)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.aquaman_img, parent, false)
            return RVViewHolder(view)
        }

        override fun onBindViewHolder(holder: RVViewHolder, position: Int) {
            val image = images[position]
            holder.itemView.aquaman.setImageResource(image)
        }

        override fun getItemCount(): Int {
            return images.size
        }
    }
