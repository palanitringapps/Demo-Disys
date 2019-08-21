package com.dysisdemo.ui.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dysisdemo/ui/news/NewsListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/dysisdemo/ui/news/NewsListItemView;", "()V", "adapter", "Lcom/dysisdemo/ui/news/NewsItemsAdapter;", "bind", "Lcom/dysisdemo/databinding/ActivityNewsLayoutBinding;", "viewModel", "Lcom/dysisdemo/ui/news/NewsListViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showLoadFailedMessage", "error", "", "showNewsList", "payload", "Lcom/dysisdemo/data/model/NewsPayload;", "app_debug"})
public final class NewsListActivity extends androidx.appcompat.app.AppCompatActivity implements com.dysisdemo.ui.news.NewsListItemView {
    private com.dysisdemo.databinding.ActivityNewsLayoutBinding bind;
    private com.dysisdemo.ui.news.NewsItemsAdapter adapter;
    private com.dysisdemo.ui.news.NewsListViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void showNewsList(@org.jetbrains.annotations.Nullable()
    com.dysisdemo.data.model.NewsPayload payload) {
    }
    
    @java.lang.Override()
    public void showLoadFailedMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public NewsListActivity() {
        super();
    }
}