package com.qasim.paging3example.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/qasim/paging3example/adapter/PixabayAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/qasim/paging3example/data/model/PixabayObj;", "Lcom/qasim/paging3example/adapter/PixabayAdapter$RedditViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "RedditViewHolder", "app_debug"})
public final class PixabayAdapter extends androidx.paging.PagingDataAdapter<com.qasim.paging3example.data.model.PixabayObj, com.qasim.paging3example.adapter.PixabayAdapter.RedditViewHolder> {
    private static final int LOADING_ITEM = 0;
    private static final int MOVIE_ITEM = 1;
    public static final com.qasim.paging3example.adapter.PixabayAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.qasim.paging3example.adapter.PixabayAdapter.RedditViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.qasim.paging3example.adapter.PixabayAdapter.RedditViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public PixabayAdapter() {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/qasim/paging3example/adapter/PixabayAdapter$RedditViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "loadImg", "Landroid/widget/ImageView;", "shimmer", "Lcom/facebook/shimmer/Shimmer;", "shimmerDrawable", "Lcom/facebook/shimmer/ShimmerDrawable;", "bindPost", "", "redditPost", "Lcom/qasim/paging3example/data/model/PixabayObj;", "app_debug"})
    public static final class RedditViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView loadImg = null;
        private final com.facebook.shimmer.Shimmer shimmer = null;
        private final com.facebook.shimmer.ShimmerDrawable shimmerDrawable = null;
        
        public final void bindPost(@org.jetbrains.annotations.NotNull()
        com.qasim.paging3example.data.model.PixabayObj redditPost) {
        }
        
        public RedditViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/qasim/paging3example/adapter/PixabayAdapter$Companion;", "", "()V", "LOADING_ITEM", "", "getLOADING_ITEM", "()I", "MOVIE_ITEM", "getMOVIE_ITEM", "app_debug"})
    public static final class Companion {
        
        public final int getLOADING_ITEM() {
            return 0;
        }
        
        public final int getMOVIE_ITEM() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}