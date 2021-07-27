package com.qasim.paging3example.di

import com.qasim.paging3example.BuildConfig
import com.qasim.paging3example.data.WebService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@InstallIn(ApplicationComponent::class)
@Module
class NetworkModule {

    internal val httpLoggingInterceptor: HttpLoggingInterceptor
        @Provides
        get() {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            return httpLoggingInterceptor
        }

    //WebService
    @Provides
    internal fun getApiInterface( retroFit: Retrofit): WebService {
        return retroFit.create(WebService::class.java)
    }

    @Provides
    internal fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    internal fun getOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }
}