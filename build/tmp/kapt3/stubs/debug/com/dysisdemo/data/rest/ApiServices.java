package com.dysisdemo.data.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/dysisdemo/data/rest/ApiServices;", "", "getNewsList", "Lretrofit2/Call;", "Lcom/dysisdemo/data/model/NewsPayload;", "language", "", "makeLoginCall", "Lcom/dysisdemo/data/model/LoginResponse;", "loginRequest", "Lcom/dysisdemo/data/model/LoginRequest;", "Companion", "app_debug"})
public abstract interface ApiServices {
    public static final com.dysisdemo.data.rest.ApiServices.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "iskan/v1/certificates/towhomitmayconcern")
    public abstract retrofit2.Call<com.dysisdemo.data.model.LoginResponse> makeLoginCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dysisdemo.data.model.LoginRequest loginRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "public/v1/news")
    public abstract retrofit2.Call<com.dysisdemo.data.model.NewsPayload> getNewsList(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "local")
    java.lang.String language);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/dysisdemo/data/rest/ApiServices$Companion;", "", "()V", "BASEAPI", "", "defaultHttpClient", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "service", "Lcom/dysisdemo/data/rest/ApiServices;", "getService", "()Lcom/dysisdemo/data/rest/ApiServices;", "sessionRetrofit", "Lretrofit2/Retrofit;", "timeoutTime", "", "app_debug"})
    public static final class Companion {
        private static final java.lang.String BASEAPI = "https://api.qa.mrhe.gov.ae/mrhecloud/v1.4/api/";
        private static final int timeoutTime = 30;
        private static final okhttp3.OkHttpClient defaultHttpClient = null;
        private static final retrofit2.Retrofit sessionRetrofit = null;
        private static final com.dysisdemo.data.rest.ApiServices service = null;
        
        public final com.dysisdemo.data.rest.ApiServices getService() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}