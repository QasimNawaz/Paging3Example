package com.qasim.paging3example.data.datasource

import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.data.model.response.Resource

interface RemoteDataSource {
    suspend fun requestPixaBay(intExtra: Int): Resource<ListingResponse>
}