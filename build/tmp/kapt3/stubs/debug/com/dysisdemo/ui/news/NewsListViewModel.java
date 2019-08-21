package com.dysisdemo.ui.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/dysisdemo/ui/news/NewsListViewModel;", "Lcom/dysisdemo/base/BaseViewModel;", "Lcom/dysisdemo/ui/news/NewsDataSource$ResponseCallBack;", "app", "Landroid/app/Application;", "repository", "Lcom/dysisdemo/ui/news/NewsItemRepository;", "view", "Lcom/dysisdemo/ui/news/NewsListItemView;", "(Landroid/app/Application;Lcom/dysisdemo/ui/news/NewsItemRepository;Lcom/dysisdemo/ui/news/NewsListItemView;)V", "newsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dysisdemo/data/model/NewsPayload;", "getRepository", "()Lcom/dysisdemo/ui/news/NewsItemRepository;", "setRepository", "(Lcom/dysisdemo/ui/news/NewsItemRepository;)V", "getView", "()Lcom/dysisdemo/ui/news/NewsListItemView;", "setView", "(Lcom/dysisdemo/ui/news/NewsListItemView;)V", "getNewsData", "", "onDataLoad", "response", "onFailure", "result", "", "NewsListViewModelFactory", "app_debug"})
public final class NewsListViewModel extends com.dysisdemo.base.BaseViewModel implements com.dysisdemo.ui.news.NewsDataSource.ResponseCallBack {
    private androidx.lifecycle.MutableLiveData<com.dysisdemo.data.model.NewsPayload> newsLiveData;
    @org.jetbrains.annotations.NotNull()
    private com.dysisdemo.ui.news.NewsItemRepository repository;
    @org.jetbrains.annotations.NotNull()
    private com.dysisdemo.ui.news.NewsListItemView view;
    
    @java.lang.Override()
    public void onDataLoad(@org.jetbrains.annotations.Nullable()
    com.dysisdemo.data.model.NewsPayload response) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
    }
    
    public final void getNewsData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dysisdemo.ui.news.NewsItemRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.news.NewsItemRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dysisdemo.ui.news.NewsListItemView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.news.NewsListItemView p0) {
    }
    
    public NewsListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.news.NewsItemRepository repository, @org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.news.NewsListItemView view) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dysisdemo/ui/news/NewsListViewModel$NewsListViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "application", "Landroid/app/Application;", "repository", "Lcom/dysisdemo/ui/news/NewsItemRepository;", "view", "Lcom/dysisdemo/ui/news/NewsListItemView;", "(Landroid/app/Application;Lcom/dysisdemo/ui/news/NewsItemRepository;Lcom/dysisdemo/ui/news/NewsListItemView;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class NewsListViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        private final android.app.Application application = null;
        private final com.dysisdemo.ui.news.NewsItemRepository repository = null;
        private final com.dysisdemo.ui.news.NewsListItemView view = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public NewsListViewModelFactory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        com.dysisdemo.ui.news.NewsItemRepository repository, @org.jetbrains.annotations.NotNull()
        com.dysisdemo.ui.news.NewsListItemView view) {
            super();
        }
    }
}