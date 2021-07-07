package com.qasim.paging3example.data.mediator

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.example.common.database.PixabayDatabase
import com.google.gson.Gson
import com.qasim.paging3example.data.WebService
import com.qasim.paging3example.data.model.PixabayKeys
import com.qasim.paging3example.data.model.PixabayObj
import com.qasim.paging3example.data.model.response.ListingResponse
import retrofit2.HttpException
import java.io.IOException

@OptIn(ExperimentalPagingApi::class)
class PixabayRemoteMediator(
    private val pixaBayService: WebService,
    private val pixaBayDatabase: PixabayDatabase
) : RemoteMediator<Int, PixabayObj>() {

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, PixabayObj>
    ): MediatorResult {
        return try {
            val loadKey = when (loadType) {
                LoadType.REFRESH -> null
                LoadType.PREPEND -> return MediatorResult.Success(endOfPaginationReached = true)
                LoadType.APPEND -> {
                    state.lastItemOrNull()
                        ?: return MediatorResult.Success(endOfPaginationReached = true)
                    getPixabayKeys()
                }
            }
            val currentPage = loadKey?.let { loadKey.index } ?: 1
            val response = pixaBayService.fetchPixabayList(
                key = "22314051-7ec0100d59007017d6ff1aad2",
                perPage = state.config.pageSize.toString(),
                page = currentPage.toString()
            )
            if (response.isSuccessful) {
                if (response.code() == 200) {
                    if (response.body() == null) {
                        return MediatorResult.Error(Throwable("Response body null"))
                    }

                    val listingResponse = Gson().fromJson<ListingResponse>(
                        response.body().toString(),
                        ListingResponse::class.java
                    )
                    if (listingResponse != null) {
                        pixaBayDatabase.withTransaction {
                            pixaBayDatabase.pixabayKeyDao()
                                .savePixabayKeys(PixabayKeys(0, currentPage + 1))
                            pixaBayDatabase.pixabayDao().savePixabayList(listingResponse.hits!!)
                        }

                    }
                    MediatorResult.Success(endOfPaginationReached = listingResponse == null)
                } else {
                    return if (response.body()
                            .toString() == "[ERROR 400] \"per_page\" is out of valid range."
                    ) {
                        MediatorResult.Success(endOfPaginationReached = true)
                    } else {
                        MediatorResult.Error(Throwable("${response.code()}"))
                    }

                }

            } else {
                return if (response.code() == 400
                ) {
                    MediatorResult.Success(endOfPaginationReached = true)
                } else {
                    return MediatorResult.Error(Throwable("Not Success"))
                }
            }

        } catch (exception: IOException) {
            MediatorResult.Error(exception)
        } catch (exception: HttpException) {
            MediatorResult.Error(exception)
        }

    }

    private suspend fun getPixabayKeys(): PixabayKeys? {
        return pixaBayDatabase.pixabayKeyDao().getPixabayKeys().firstOrNull()

    }
}