package com.qasim.paging3example.data.model.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.qasim.paging3example.data.model.PixabayObj
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListingResponse(

    @field:SerializedName("total")
    val total: Int? = null,

    @field:SerializedName("hits")
    val hits: List<PixabayObj>? = emptyList(),

    @field:SerializedName("totalHits")
    val totalHits: Int? = null
) : Parcelable