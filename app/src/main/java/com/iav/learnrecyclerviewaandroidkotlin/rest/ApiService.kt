package com.iav.learnrecyclerviewaandroidkotlin.rest

import com.iav.learnrecyclerviewaandroidkotlin.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("posts/")
    fun getAllPosts(): Observable<List<Post>>

}