package com.dysisdemo.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\f"}, d2 = {"Lcom/dysisdemo/ui/login/LoginRemoteDataService;", "Lcom/dysisdemo/ui/login/DataSource;", "()V", "callLogin", "", "username", "", "password", "callBack", "Lcom/dysisdemo/ui/login/DataSource$ResponseCallBack;", "prepareRequest", "Lcom/dysisdemo/data/model/LoginRequest;", "app_debug"})
public final class LoginRemoteDataService implements com.dysisdemo.ui.login.DataSource {
    
    @java.lang.Override()
    public void callLogin(@org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.DataSource.ResponseCallBack callBack) {
    }
    
    private final com.dysisdemo.data.model.LoginRequest prepareRequest() {
        return null;
    }
    
    public LoginRemoteDataService() {
        super();
    }
}