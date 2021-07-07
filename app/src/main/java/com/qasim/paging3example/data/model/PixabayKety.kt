package com.qasim.paging3example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pixaBayKeys")
data class PixabayKeys(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val index: Int = 1
)