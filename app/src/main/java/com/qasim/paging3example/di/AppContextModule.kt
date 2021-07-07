package com.qasim.paging3example.di

import android.content.Context
import com.qasim.paging3example.app.AppController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
class AppContextModule {
    @Provides
    fun getApplicationContext(): Context = AppController.getAppContext().applicationContext
}