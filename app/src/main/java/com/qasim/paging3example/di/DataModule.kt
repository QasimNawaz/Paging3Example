package com.qasim.paging3example.di

import com.qasim.paging3example.data.datasource.DataRepositorySource
import com.qasim.paging3example.data.repo.DataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

// Tells Dagger this is a Dagger module
@Module
@InstallIn(ApplicationComponent::class)
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun provideDataRepository(dataRepository: DataRepository): DataRepositorySource
}
