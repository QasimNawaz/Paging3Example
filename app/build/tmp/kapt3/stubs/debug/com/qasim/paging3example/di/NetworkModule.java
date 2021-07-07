package com.qasim.paging3example.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\rH\u0001\u00a2\u0006\u0002\b\u0011R\u0014\u0010\u0003\u001a\u00020\u00048AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/qasim/paging3example/di/NetworkModule;", "", "()V", "httpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getHttpLoggingInterceptor$app_debug", "()Lokhttp3/logging/HttpLoggingInterceptor;", "getApiInterface", "Lcom/qasim/paging3example/data/WebService;", "retroFit", "Lretrofit2/Retrofit;", "getApiInterface$app_debug", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient$app_debug", "getRetrofit", "okHttpClient", "getRetrofit$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor getHttpLoggingInterceptor$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.qasim.paging3example.data.WebService getApiInterface$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retroFit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit getRetrofit$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient getOkHttpClient$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}