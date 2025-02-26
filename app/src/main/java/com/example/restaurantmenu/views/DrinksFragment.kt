package com.example.restaurantmenu.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantmenu.R
import com.example.restaurantmenu.adapters.ItemsMenuAdapter
import com.example.restaurantmenu.database.DrinkDatabase


class DrinksFragment : Fragment() {

    private lateinit var mRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_drinks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mRecyclerView = view.findViewById(R.id.drinks_recycle_view)
        mRecyclerView.layoutManager = LinearLayoutManager(context)
    }

    override fun onStart() {
        super.onStart()
        val drinksList = DrinkDatabase.findAll()
        val itemsMenuAdapter = ItemsMenuAdapter(drinksList)
        mRecyclerView.adapter = itemsMenuAdapter
        itemsMenuAdapter.notifyDataSetChanged()
    }

}