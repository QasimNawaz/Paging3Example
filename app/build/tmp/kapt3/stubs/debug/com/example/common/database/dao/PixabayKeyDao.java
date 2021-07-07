package com.example.common.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/common/database/dao/PixabayKeyDao;", "", "deleteKeys", "", "getPixabayKeys", "", "Lcom/qasim/paging3example/data/model/PixabayKeys;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePixabayKeys", "redditKey", "(Lcom/qasim/paging3example/data/model/PixabayKeys;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PixabayKeyDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object savePixabayKeys(@org.jetbrains.annotations.NotNull()
    com.qasim.paging3example.data.model.PixabayKeys redditKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM pixaBayKeys ORDER BY id DESC")
    public abstract java.lang.Object getPixabayKeys(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.qasim.paging3example.data.model.PixabayKeys>> p0);
    
    @androidx.room.Query(value = "DELETE FROM pixaBayKeys")
    public abstract void deleteKeys();
}