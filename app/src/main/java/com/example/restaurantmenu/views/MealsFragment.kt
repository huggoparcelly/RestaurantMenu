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
import com.example.restaurantmenu.database.MealDatabase


class MealsFragment : Fragment() {

    private lateinit var mRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_meals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mRecyclerView = view.findViewById(R.id.meals_recycle_view)
        mRecyclerView.layoutManager = LinearLayoutManager(context)
    }

    override fun onStart() {
        super.onStart()
        val mealsList = MealDatabase.findAll()
        val itemsMenuAdapter = ItemsMenuAdapter(mealsList)
        mRecyclerView.adapter = itemsMenuAdapter
        itemsMenuAdapter.notifyDataSetChanged()
    }

}