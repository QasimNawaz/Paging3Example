package com.example.common.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.qasim.paging3example.data.model.PixabayKeys

@Dao
interface PixabayKeyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePixabayKeys(redditKey: PixabayKeys)

    @Query("SELECT * FROM pixaBayKeys ORDER BY id DESC")
    suspend fun getPixabayKeys(): List<PixabayKeys>

    @Query("DELETE FROM pixaBayKeys")
    fun deleteKeys()
}