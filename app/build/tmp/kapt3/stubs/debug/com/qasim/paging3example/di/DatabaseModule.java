package com.qasim.paging3example.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/qasim/paging3example/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/example/common/database/PixabayDatabase;", "appContext", "Landroid/content/Context;", "providePixabayDao", "Lcom/qasim/paging3example/data/database/dao/PixabayDao;", "appDatabase", "providePixabayKeysDao", "Lcom/example/common/database/dao/PixabayKeyDao;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.qasim.paging3example.data.database.dao.PixabayDao providePixabayDao(@org.jetbrains.annotations.NotNull()
    com.example.common.database.PixabayDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.common.database.dao.PixabayKeyDao providePixabayKeysDao(@org.jetbrains.annotations.NotNull()
    com.example.common.database.PixabayDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.common.database.PixabayDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    public DatabaseModule() {
        super();
    }
}