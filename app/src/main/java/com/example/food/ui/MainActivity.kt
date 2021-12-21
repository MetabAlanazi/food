package com.example.food.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.food.R
import com.example.food.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.recipes_fragment, R.id.food_joke_fragment, R.id.favorite_recipes_fragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
//        supportFragmentManager.commit {
//            add(R.id.nav_host_fragment, RecipesFragment())
//
//        }
//        binding.navView.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.recipes_fragment -> {
//                    supportFragmentManager.commit {
//                        replace(R.id.nav_host_fragment, RecipesFragment())
//
//                    }
//                    true
//                }
//                R.id.favorite_recipes_fragment -> {
//                    supportFragmentManager.commit {
//                        replace(R.id.nav_host_fragment, FavoriteRecipesFragment())
//
//                    }
//                    true
//                }
//                R.id.food_joke_fragment -> {
//                    supportFragmentManager.commit {
//                        replace(R.id.nav_host_fragment, FoodJokeFragment())
//
//                    }
//                    true
//                }
//                else -> {
//                    false
//                }
//            }
//        }
//
  }

}


