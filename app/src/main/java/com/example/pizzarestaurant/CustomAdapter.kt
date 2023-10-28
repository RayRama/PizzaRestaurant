package com.example.pizzarestaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val foodList: List<FoodItem>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.foodImage)
        val foodName: TextView = itemView.findViewById(R.id.foodName)
        val foodDescription: TextView = itemView.findViewById(R.id.foodDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodList[position]

        holder.foodImage.setImageResource(foodItem.image)
        holder.foodName.text = foodItem.name
        holder.foodDescription.text = foodItem.desc
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}