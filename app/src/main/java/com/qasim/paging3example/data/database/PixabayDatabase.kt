package com.example.common.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.qasim.paging3example.data.model.PixabayKeys
import com.qasim.paging3example.data.model.PixabayObj
import com.qasim.paging3example.data.database.dao.PixabayDao
import com.example.common.database.dao.PixabayKeyDao

@Database(
    entities = [PixabayObj::class, PixabayKeys::class],
    version = 1,
    exportSchema = false
)
abstract class PixabayDatabase : RoomDatabase() {
    abstract fun pixabayDao(): PixabayDao
    abstract fun pixabayKeyDao(): PixabayKeyDao
}