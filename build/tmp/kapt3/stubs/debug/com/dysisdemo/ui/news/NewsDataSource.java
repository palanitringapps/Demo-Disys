package com.dysisdemo.ui.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/dysisdemo/ui/news/NewsDataSource;", "", "getNews", "", "language", "", "callBack", "Lcom/dysisdemo/ui/news/NewsDataSource$ResponseCallBack;", "ResponseCallBack", "app_debug"})
public abstract interface NewsDataSource {
    
    public abstract void getNews(@org.jetbrains.annotations.Nullable()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.news.NewsDataSource.ResponseCallBack callBack);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/dysisdemo/ui/news/NewsDataSource$ResponseCallBack;", "", "onDataLoad", "", "response", "Lcom/dysisdemo/data/model/NewsPayload;", "onFailure", "result", "", "app_debug"})
    public static abstract interface ResponseCallBack {
        
        public abstract void onDataLoad(@org.jetbrains.annotations.Nullable()
        com.dysisdemo.data.model.NewsPayload response);
        
        public abstract void onFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String result);
    }
}