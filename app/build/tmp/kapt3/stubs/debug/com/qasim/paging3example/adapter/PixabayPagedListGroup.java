package com.qasim.paging3example.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0001H\u0002J\u0014\u0010\u001e\u001a\u00020\u001a2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0001H\u0016J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0016J \u0010)\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001aH\u0016J*\u0010)\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J \u0010,\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001aH\u0016J \u0010-\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001aH\u0016J\u0018\u0010.\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u0002H\u0016J\u001e\u00101\u001a\u00020!2\u0006\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fJ\u0010\u00105\u001a\u00020!2\u0006\u00100\u001a\u00020\u0002H\u0016R\u0019\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/qasim/paging3example/adapter/PixabayPagedListGroup;", "Lcom/xwray/groupie/Group;", "Lcom/xwray/groupie/GroupDataObserver;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "differ", "Landroidx/paging/AsyncPagingDataDiffer;", "Lcom/qasim/paging3example/adapter/PixabayItem;", "listUpdateCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "pagedList", "Landroidx/paging/PagingData;", "getPagedList", "()Landroidx/paging/PagingData;", "setPagedList", "(Landroidx/paging/PagingData;)V", "parentObserver", "placeHolder", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "getItem", "Lcom/xwray/groupie/Item;", "position", "", "getItemCount", "getItemPosition", "group", "getPosition", "item", "onChanged", "", "onItemChanged", "payload", "", "onItemInserted", "onItemMoved", "fromPosition", "toPosition", "onItemRangeChanged", "positionStart", "itemCount", "onItemRangeInserted", "onItemRangeRemoved", "onItemRemoved", "registerGroupDataObserver", "groupDataObserver", "submitList", "lifetime", "Landroidx/lifecycle/Lifecycle;", "newPagedList", "unregisterGroupDataObserver", "app_debug"})
public final class PixabayPagedListGroup implements com.xwray.groupie.Group, com.xwray.groupie.GroupDataObserver {
    private final java.lang.String TAG = null;
    private com.xwray.groupie.GroupDataObserver parentObserver;
    @org.jetbrains.annotations.Nullable()
    private androidx.paging.PagingData<com.qasim.paging3example.adapter.PixabayItem> pagedList;
    private final androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback = null;
    private final androidx.paging.AsyncPagingDataDiffer<com.qasim.paging3example.adapter.PixabayItem> differ = null;
    private com.xwray.groupie.kotlinandroidextensions.Item placeHolder;
    
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.paging.PagingData<com.qasim.paging3example.adapter.PixabayItem> getPagedList() {
        return null;
    }
    
    public final void setPagedList(@org.jetbrains.annotations.Nullable()
    androidx.paging.PagingData<com.qasim.paging3example.adapter.PixabayItem> p0) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifetime, @org.jetbrains.annotations.Nullable()
    androidx.paging.PagingData<com.qasim.paging3example.adapter.PixabayItem> newPagedList) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.xwray.groupie.Item<?> getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getPosition(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Item<?> item) {
        return 0;
    }
    
    @java.lang.Override()
    public void registerGroupDataObserver(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.GroupDataObserver groupDataObserver) {
    }
    
    @java.lang.Override()
    public void unregisterGroupDataObserver(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.GroupDataObserver groupDataObserver) {
    }
    
    @java.lang.Override()
    public void onChanged(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group) {
    }
    
    @java.lang.Override()
    public void onItemInserted(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int position) {
    }
    
    @java.lang.Override()
    public void onItemChanged(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int position) {
    }
    
    @java.lang.Override()
    public void onItemChanged(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object payload) {
    }
    
    @java.lang.Override()
    public void onItemRemoved(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int position) {
    }
    
    @java.lang.Override()
    public void onItemRangeChanged(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int positionStart, int itemCount, @org.jetbrains.annotations.Nullable()
    java.lang.Object payload) {
    }
    
    @java.lang.Override()
    public void onItemRangeInserted(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int positionStart, int itemCount) {
    }
    
    @java.lang.Override()
    public void onItemRangeRemoved(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int positionStart, int itemCount) {
    }
    
    @java.lang.Override()
    public void onItemMoved(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int fromPosition, int toPosition) {
    }
    
    @java.lang.Override()
    public void onItemRangeChanged(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Group group, int positionStart, int itemCount) {
    }
    
    private final int getItemPosition(com.xwray.groupie.Group group) {
        return 0;
    }
    
    public PixabayPagedListGroup() {
        super();
    }
}