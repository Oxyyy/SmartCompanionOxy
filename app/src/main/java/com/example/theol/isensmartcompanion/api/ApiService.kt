package com.example.theol.isensmartcompanion.api

import com.example.theol.isensmartcompanion.models.EventModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("events.json")
    fun getEvents(): Call<List<EventModel>>
}