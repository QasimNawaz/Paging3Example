package com.qasim.paging3example.data.repo

import com.qasim.paging3example.data.datasource.DataRepositorySource
import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.data.model.response.Resource
import com.qasim.paging3example.data.remote.RemoteData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class DataRepository @Inject constructor(
    private val remoteRepository: RemoteData,
    private val ioDispatcher: CoroutineContext
) : DataRepositorySource {

    override suspend fun requestPixaBayDetail(intExtra: Int): Flow<Resource<ListingResponse>> {
        return flow {
            emit(remoteRepository.requestPixaBay(intExtra))
        }.flowOn(ioDispatcher)
    }

}