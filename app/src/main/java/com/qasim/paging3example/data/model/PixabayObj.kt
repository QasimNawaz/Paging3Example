package com.qasim.paging3example.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "pixabayList")
@Parcelize
data class PixabayObj(

    @ColumnInfo(name = "webformatHeight")
    @field:SerializedName("webformatHeight")
    val webformatHeight: Int? = null,

    @ColumnInfo(name = "imageWidth")
    @field:SerializedName("imageWidth")
    val imageWidth: Int? = null,

    @ColumnInfo(name = "previewHeight")
    @field:SerializedName("previewHeight")
    val previewHeight: Int? = null,

    @ColumnInfo(name = "webformatURL")
    @field:SerializedName("webformatURL")
    val webformatURL: String? = null,

    @ColumnInfo(name = "userImageURL")
    @field:SerializedName("userImageURL")
    val userImageURL: String? = null,

    @ColumnInfo(name = "previewURL")
    @field:SerializedName("previewURL")
    val previewURL: String? = null,

    @ColumnInfo(name = "comments")
    @field:SerializedName("comments")
    val comments: Int? = null,

    @ColumnInfo(name = "type")
    @field:SerializedName("type")
    val type: String? = null,

    @ColumnInfo(name = "imageHeight")
    @field:SerializedName("imageHeight")
    val imageHeight: Int? = null,

    @ColumnInfo(name = "tags")
    @field:SerializedName("tags")
    val tags: String? = null,

    @ColumnInfo(name = "previewWidth")
    @field:SerializedName("previewWidth")
    val previewWidth: Int? = null,

    @ColumnInfo(name = "downloads")
    @field:SerializedName("downloads")
    val downloads: Int? = null,

    @ColumnInfo(name = "collections")
    @field:SerializedName("collections")
    val collections: Int? = null,

    @ColumnInfo(name = "user_id")
    @field:SerializedName("user_id")
    val userId: Int? = null,

    @ColumnInfo(name = "largeImageURL")
    @field:SerializedName("largeImageURL")
    val largeImageURL: String? = null,

    @ColumnInfo(name = "pageURL")
    @field:SerializedName("pageURL")
    val pageURL: String? = null,

    @PrimaryKey
    @ColumnInfo(name = "id")
    @field:SerializedName("id")
    val id: Int? = null,

    @ColumnInfo(name = "imageSize")
    @field:SerializedName("imageSize")
    val imageSize: Int? = null,

    @ColumnInfo(name = "webformatWidth")
    @field:SerializedName("webformatWidth")
    val webformatWidth: Int? = null,

    @ColumnInfo(name = "user")
    @field:SerializedName("user")
    val user: String? = null,

    @ColumnInfo(name = "views")
    @field:SerializedName("views")
    val views: Int? = null,

    @ColumnInfo(name = "likes")
    @field:SerializedName("likes")
    val likes: Int? = null
) : Parcelable
