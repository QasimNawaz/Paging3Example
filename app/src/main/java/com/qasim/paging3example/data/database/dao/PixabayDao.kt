package com.qasim.paging3example.data.database.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.qasim.paging3example.data.model.PixabayObj

@Dao
interface PixabayDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePixabayList(redditPosts: List<PixabayObj>)

    @Query("SELECT * FROM pixabayList")
    fun getPixabayList(): PagingSource<Int, PixabayObj>

    @Query("DELETE FROM pixabayList")
    fun deletePixbay()
}