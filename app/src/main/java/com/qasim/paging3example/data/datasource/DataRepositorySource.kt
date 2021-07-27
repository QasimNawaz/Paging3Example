package com.qasim.paging3example.data.datasource

import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.data.model.response.Resource
import kotlinx.coroutines.flow.Flow

interface DataRepositorySource {
    suspend fun requestPixaBayDetail(intExtra: Int): Flow<Resource<ListingResponse>>
}