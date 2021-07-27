package com.qasim.paging3example.di

import android.content.Context
import com.qasim.paging3example.utils.Network
import com.qasim.paging3example.utils.NetworkConnectivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCoroutineContext(): CoroutineContext {
        return Dispatchers.IO
    }

    @Provides
    @Singleton
    fun provideNetworkConnectivity(@ApplicationContext context: Context): NetworkConnectivity {
        return Network(context)
    }
}