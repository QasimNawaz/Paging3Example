package com.qasim.paging3example.data

import com.google.gson.JsonElement
import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.utils.Constant
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("api")
    suspend fun fetchPixabayList(
        @Query("key") key: String = Constant.KEY,
        @Query("page") page: String,
        @Query("per_page") perPage: String
    ): Response<JsonElement>

    @GET("api")
    suspend fun fetchPixabayDetail(
        @Query("key") key: String = Constant.KEY,
        @Query("id") id: Int
    ): Response<ListingResponse>
}