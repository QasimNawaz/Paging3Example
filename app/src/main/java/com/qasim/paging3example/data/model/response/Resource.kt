package com.qasim.paging3example.data.model.response

import java.lang.Exception

// A generic class that contains data and status about loading this data.
sealed class Resource<T>(
    private val data: T? = null,
    private val exception: Exception? = null
) {
    class Success<T>(val d: T?) : Resource<T>(d)
    class Loading<T>(val d: T? = null) : Resource<T>(d)
    class DataError<T>(val e: Exception) : Resource<T>(null, e)

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is DataError -> "Error[exception=$exception]"
            is Loading<T> -> "Loading"
        }
    }
}