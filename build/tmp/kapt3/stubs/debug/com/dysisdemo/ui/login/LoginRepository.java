package com.dysisdemo.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/dysisdemo/ui/login/LoginRepository;", "", "loginDataSource", "Lcom/dysisdemo/ui/login/DataSource;", "(Lcom/dysisdemo/ui/login/DataSource;)V", "getLoginDataSource", "()Lcom/dysisdemo/ui/login/DataSource;", "setLoginDataSource", "getLoginSuccessData", "", "username", "", "password", "callBack", "Lcom/dysisdemo/ui/login/DataSource$ResponseCallBack;", "app_debug"})
public final class LoginRepository {
    @org.jetbrains.annotations.NotNull()
    private com.dysisdemo.ui.login.DataSource loginDataSource;
    
    public final void getLoginSuccessData(@org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.DataSource.ResponseCallBack callBack) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dysisdemo.ui.login.DataSource getLoginDataSource() {
        return null;
    }
    
    public final void setLoginDataSource(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.DataSource p0) {
    }
    
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.DataSource loginDataSource) {
        super();
    }
}