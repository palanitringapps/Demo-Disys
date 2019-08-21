package com.dysisdemo.ui.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\"\u0010\u0012\u001a\u00020\n2\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0015R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/dysisdemo/ui/news/NewsItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dysisdemo/ui/news/NewsListItemViewHolder;", "()V", "newsData", "", "Lcom/dysisdemo/data/model/NewsData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "updateData", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class NewsItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dysisdemo.ui.news.NewsListItemViewHolder> {
    private java.util.List<com.dysisdemo.data.model.NewsData> newsData;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dysisdemo.ui.news.NewsListItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.news.NewsListItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.news.NewsListItemViewHolder holder) {
    }
    
    public final void updateData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.dysisdemo.data.model.NewsData> data) {
    }
    
    public NewsItemsAdapter() {
        super();
    }
}