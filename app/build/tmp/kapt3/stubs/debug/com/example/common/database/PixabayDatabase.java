package com.example.common.database;

import java.lang.System;

@androidx.room.Database(entities = {com.qasim.paging3example.data.model.PixabayObj.class, com.qasim.paging3example.data.model.PixabayKeys.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/common/database/PixabayDatabase;", "Landroidx/room/RoomDatabase;", "()V", "pixabayDao", "Lcom/qasim/paging3example/data/database/dao/PixabayDao;", "pixabayKeyDao", "Lcom/example/common/database/dao/PixabayKeyDao;", "app_debug"})
public abstract class PixabayDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.qasim.paging3example.data.database.dao.PixabayDao pixabayDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.common.database.dao.PixabayKeyDao pixabayKeyDao();
    
    public PixabayDatabase() {
        super();
    }
}