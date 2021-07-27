package com.qasim.paging3example.data.datasource

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.google.gson.Gson
import com.qasim.paging3example.adapter.item.PixabayItem
import com.qasim.paging3example.data.WebService
import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.utils.Constant.TMDB_STARTING_PAGE_INDEX

class PixabayDataSource(val apiService: WebService) :
    PagingSource<Int, PixabayItem>() {
    override fun getRefreshKey(state: PagingState<Int, PixabayItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PixabayItem> {
        try {
            val pageIndex = params.key ?: TMDB_STARTING_PAGE_INDEX
            val response =
                apiService.fetchPixabayList(
                    perPage = params.loadSize.toString(),
                    page = params.key.toString()
                )
            if (response.isSuccessful) {
                if (response.code() == 200) {
                    if (response.body() == null) {
                        return LoadResult.Error(Throwable("Response body null"))
                    }
                    val listingResponse = Gson().fromJson<ListingResponse>(
                        response.body().toString(),
                        ListingResponse::class.java
                    )
                    val passengerList = listingResponse?.hits?.map {
                        PixabayItem(
                            pixabayModel = it!!
                        )
                    }
                    val nextKey =
                        if (passengerList!!.isEmpty()) {
                            null
                        } else {
                            pageIndex + (params.loadSize / 50)
                        }
                    return LoadResult.Page(
                        data = passengerList,
                        prevKey = if (pageIndex == TMDB_STARTING_PAGE_INDEX) null else pageIndex, // Only paging forward.
                        nextKey = nextKey
                    )
                } else {
                    return LoadResult.Error(
                        Throwable(
                            response.message(),
                            Throwable("${response.code()}")
                        )
                    )
                }

            } else {
                return LoadResult.Error(Throwable("Not Success"))
            }

        } catch (exception: Exception) {
            Log.e("PostsDataSource", "Exception: ${exception.message}")
            return LoadResult.Error(Throwable(exception.message, exception.cause))
        }
    }

}