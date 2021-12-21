package com.example.food

import com.example.food.models.FoodRicpe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface FoodRicpesApi{



@GET("/recipes/complexSearch")
    suspend fun GetRecipes(@QueryMap queries: Map<String , String>):Response<FoodRicpe>
}