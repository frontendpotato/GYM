package com.example.gym

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExerciceAdapter(
    private val items: List<ExerciceItem>,
    private val onItemClick: (ExerciceItem) -> Unit // Click listener
) : RecyclerView.Adapter<ExerciceAdapter.ExerciceViewHolder>() {

    // ViewHolder for the RecyclerView items
    inner class ExerciceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.item_image)
        private val titleView: TextView = itemView.findViewById(R.id.item_title)

        // Bind data to the views
        fun bind(item: ExerciceItem) {
            imageView.setImageResource(item.imageResId)
            titleView.text = item.title

            // Set click listener for the item
            itemView.setOnClickListener {
                onItemClick(item)
            }
        }
    }

    // Inflate the item layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return ExerciceViewHolder(view)
    }

    // Bind data to the ViewHolder
    override fun onBindViewHolder(holder: ExerciceViewHolder, position: Int) {
        holder.bind(items[position])
    }

    // Return the number of items
    override fun getItemCount(): Int = items.size
}




