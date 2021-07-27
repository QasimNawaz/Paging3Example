package com.qasim.paging3example.data.remote

import com.qasim.paging3example.data.WebService
import com.qasim.paging3example.data.datasource.RemoteDataSource
import com.qasim.paging3example.data.model.response.ListingResponse
import com.qasim.paging3example.data.model.response.Resource
import com.qasim.paging3example.utils.ConnectivityException
import com.qasim.paging3example.utils.NetworkConnectivity
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject


class RemoteData @Inject
constructor(
    private val webService: WebService,
    private val networkConnectivity: NetworkConnectivity
) : RemoteDataSource {
    override suspend fun requestPixaBay(intExtra: Int): Resource<ListingResponse> {
        val response = processCall { webService.fetchPixabayDetail(id = intExtra) }
        return response!!
    }

    private suspend fun <T : Any?> processCall(responseCall: suspend () -> Response<T>): Resource<T>? {
        if (!networkConnectivity.isConnected()) {
            return Resource.DataError(ConnectivityException())
        }
        return try {
            val response = responseCall.invoke()
            if (response.isSuccessful) {
                Resource.Success(response.body())
            } else {
                return try {
                    Resource.DataError(
                        Exception(
                            "${
                                response.errorBody()?.byteString().toString()
                            }\n${response.code()}"
                        )
                    )
                } catch (e: Exception) {
                    e.printStackTrace()
                    Resource.DataError(e)
                }

            }
        } catch (e: IOException) {
            Resource.DataError(e)
        }
    }
}