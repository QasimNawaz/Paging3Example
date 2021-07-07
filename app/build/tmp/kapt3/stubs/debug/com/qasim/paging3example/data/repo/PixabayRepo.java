package com.qasim.paging3example.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/qasim/paging3example/data/repo/PixabayRepo;", "", "pixaBayService", "Lcom/qasim/paging3example/data/WebService;", "pixaBayDatabase", "Lcom/example/common/database/PixabayDatabase;", "(Lcom/qasim/paging3example/data/WebService;Lcom/example/common/database/PixabayDatabase;)V", "fetchPixabay", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/qasim/paging3example/adapter/PixabayItem;", "fetchPixabayMediator", "Lcom/qasim/paging3example/data/model/PixabayObj;", "app_debug"})
@javax.inject.Singleton()
public final class PixabayRepo {
    private final com.qasim.paging3example.data.WebService pixaBayService = null;
    private final com.example.common.database.PixabayDatabase pixaBayDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.qasim.paging3example.data.model.PixabayObj>> fetchPixabayMediator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.qasim.paging3example.adapter.PixabayItem>> fetchPixabay() {
        return null;
    }
    
    @javax.inject.Inject()
    public PixabayRepo(@org.jetbrains.annotations.NotNull()
    com.qasim.paging3example.data.WebService pixaBayService, @org.jetbrains.annotations.NotNull()
    com.example.common.database.PixabayDatabase pixaBayDatabase) {
        super();
    }
}