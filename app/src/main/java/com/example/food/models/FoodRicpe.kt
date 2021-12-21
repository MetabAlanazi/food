package com.example.food.models


import com.google.gson.annotations.SerializedName

data class FoodRicpe(
    @SerializedName("results")
    val results: List<Result>
)