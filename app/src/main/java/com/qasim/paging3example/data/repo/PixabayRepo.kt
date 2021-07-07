package com.qasim.paging3example.data.repo

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.common.database.PixabayDatabase
import com.qasim.paging3example.adapter.item.PixabayItem
import com.qasim.paging3example.data.WebService
import com.qasim.paging3example.data.datasource.PixabayDataSource
import com.qasim.paging3example.data.mediator.PixabayRemoteMediator
import com.qasim.paging3example.data.model.PixabayObj
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PixabayRepo @Inject constructor(
    private val pixaBayService: WebService,
    private val pixaBayDatabase: PixabayDatabase
) {

    @OptIn(ExperimentalPagingApi::class)
    fun fetchPixabayMediator(): Flow<PagingData<PixabayObj>> {
        return Pager(
            PagingConfig(
                pageSize = 50,
                prefetchDistance = 25,
                enablePlaceholders = false,
                initialLoadSize = 50
            ),
            remoteMediator = PixabayRemoteMediator(pixaBayService, pixaBayDatabase),
            pagingSourceFactory = { pixaBayDatabase.pixabayDao().getPixabayList() }
        ).flow
    }

    fun fetchPixabay(): Flow<PagingData<PixabayItem>> {
        return Pager(
            config = PagingConfig(
                pageSize = 50,
                prefetchDistance = 25,
                enablePlaceholders = false,
                initialLoadSize = 50
            ),
            pagingSourceFactory = { PixabayDataSource(pixaBayService) }
        ).flow
    }


}