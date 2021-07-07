package com.qasim.paging3example.ui.pagingwithroom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/qasim/paging3example/ui/pagingwithroom/PagingWithRoomViewModel;", "Landroidx/lifecycle/ViewModel;", "pixabayRepo", "Lcom/qasim/paging3example/data/repo/PixabayRepo;", "(Lcom/qasim/paging3example/data/repo/PixabayRepo;)V", "fetchPixabayList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/qasim/paging3example/data/model/PixabayObj;", "app_debug"})
public final class PagingWithRoomViewModel extends androidx.lifecycle.ViewModel {
    private final com.qasim.paging3example.data.repo.PixabayRepo pixabayRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.qasim.paging3example.data.model.PixabayObj>> fetchPixabayList() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public PagingWithRoomViewModel(@org.jetbrains.annotations.NotNull()
    com.qasim.paging3example.data.repo.PixabayRepo pixabayRepo) {
        super();
    }
}