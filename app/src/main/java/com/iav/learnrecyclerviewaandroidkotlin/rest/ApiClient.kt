package com.iav.learnrecyclerviewaandroidkotlin.rest

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {

    val BASE_URL = "https://jsonplaceholder.typicode.com/"

    fun client(): ApiService{
        val gson = GsonBuilder().create()
        return Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(BASE_URL)
            .build()
            .create(ApiService::class.java)
    }





}