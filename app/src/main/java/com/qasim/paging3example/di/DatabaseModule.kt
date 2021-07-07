package com.qasim.paging3example.di

import android.content.Context
import androidx.room.Room
import com.example.common.database.PixabayDatabase
import com.example.common.database.dao.PixabayKeyDao
import com.qasim.paging3example.data.database.dao.PixabayDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun providePixabayDao(appDatabase: PixabayDatabase): PixabayDao {
        return appDatabase.pixabayDao()
    }

    @Provides
    fun providePixabayKeysDao(appDatabase: PixabayDatabase): PixabayKeyDao {
        return appDatabase.pixabayKeyDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): PixabayDatabase {
        return Room.databaseBuilder(
            appContext,
            PixabayDatabase::class.java,
            "pixabay.db"
        ).build()
    }
}