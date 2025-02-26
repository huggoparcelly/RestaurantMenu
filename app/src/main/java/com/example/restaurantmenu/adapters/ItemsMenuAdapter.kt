package com.example.restaurantmenu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.restaurantmenu.R
import com.example.restaurantmenu.models.MenuItem

class ItemsMenuAdapter(private val items: List<MenuItem>): Adapter<ItemsMenuAdapter.ItemsViewHolder>() {

    class ItemsViewHolder(view: View): ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.item_name)
        val description = view.findViewById<TextView>(R.id.item_description)
        val price = view.findViewById<TextView>(R.id.item_price)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return ItemsViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ItemsViewHolder,
        position: Int
    ) {
        val item = items[position]
        holder.name.text = item.name
        holder.description.text = item.description
        holder.price.text = "R$ ${item.price.toString().replace(".", ",")}"
    }

    override fun getItemCount() = items.size

}