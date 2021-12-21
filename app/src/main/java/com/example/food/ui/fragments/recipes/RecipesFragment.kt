package com.example.food.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.food.R
import com.todkars.shimmer.ShimmerRecyclerView


class RecipesFragment : Fragment()  {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//     return inflater.inflate(R.layout.fragment_recipes, container, false)
        val view = inflater.inflate(R.layout.fragment_recipes, container, false)
        var shimmer = view.findViewById<ShimmerRecyclerView>(R.id.recyclerview)
        shimmer.showShimmer()
        return view
    }

}