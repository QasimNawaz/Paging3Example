package com.qasim.paging3example.data

import com.google.gson.JsonElement
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("api")
    suspend fun fetchPixabayList(
        @Query("key") key: String,
        @Query("page") page: String,
        @Query("per_page") perPage: String
    ): Response<JsonElement>
}