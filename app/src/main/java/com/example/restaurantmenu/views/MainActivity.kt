package com.example.restaurantmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurantmenu.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val bottomNavigation: BottomNavigationView by lazy { findViewById(R.id.main_bottom_navigation) }
    private val mealFragment = MealsFragment()
    private val drinkFragment = DrinksFragment()
    private val fingerFoodFragment = FingerFoodsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_container, mealFragment)
            .commit()

        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.bottom_navigation_meal -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_fragment_container, mealFragment)
                        .commit()
                }

                R.id.bottom_navigation_drink -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_fragment_container, drinkFragment)
                        .commit()
                }

                R.id.bottom_navigation_finger_food -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_fragment_container, fingerFoodFragment)
                        .commit()
                }
            }

            true
        }

    }
}