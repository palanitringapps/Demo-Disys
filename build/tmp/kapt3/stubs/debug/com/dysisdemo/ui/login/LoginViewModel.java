package com.dysisdemo.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\nH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lcom/dysisdemo/ui/login/LoginViewModel;", "Lcom/dysisdemo/base/BaseViewModel;", "Lcom/dysisdemo/ui/login/DataSource$ResponseCallBack;", "app", "Landroid/app/Application;", "loginRepository", "Lcom/dysisdemo/ui/login/LoginRepository;", "view", "Lcom/dysisdemo/ui/login/LoginView;", "username", "", "password", "(Landroid/app/Application;Lcom/dysisdemo/ui/login/LoginRepository;Lcom/dysisdemo/ui/login/LoginView;Ljava/lang/String;Ljava/lang/String;)V", "getLoginRepository", "()Lcom/dysisdemo/ui/login/LoginRepository;", "setLoginRepository", "(Lcom/dysisdemo/ui/login/LoginRepository;)V", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "getUsername", "setUsername", "getView", "()Lcom/dysisdemo/ui/login/LoginView;", "setView", "(Lcom/dysisdemo/ui/login/LoginView;)V", "loginUser", "", "onDataLoad", "response", "Lcom/dysisdemo/data/model/LoginResponse;", "onFailure", "result", "LoginModelFactory", "app_debug"})
public final class LoginViewModel extends com.dysisdemo.base.BaseViewModel implements com.dysisdemo.ui.login.DataSource.ResponseCallBack {
    @org.jetbrains.annotations.NotNull()
    private com.dysisdemo.ui.login.LoginRepository loginRepository;
    @org.jetbrains.annotations.NotNull()
    private com.dysisdemo.ui.login.LoginView view;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    
    @java.lang.Override()
    public void onDataLoad(@org.jetbrains.annotations.Nullable()
    com.dysisdemo.data.model.LoginResponse response) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
    }
    
    public final void loginUser() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dysisdemo.ui.login.LoginRepository getLoginRepository() {
        return null;
    }
    
    public final void setLoginRepository(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.LoginRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dysisdemo.ui.login.LoginView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.LoginView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
    com.dysisdemo.ui.login.LoginView view, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dysisdemo/ui/login/LoginViewModel$LoginModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "application", "Landroid/app/Application;", "loginRepository", "Lcom/dysisdemo/ui/login/LoginRepository;", "view", "Lcom/dysisdemo/ui/login/LoginView;", "username", "", "password", "(Landroid/app/Application;Lcom/dysisdemo/ui/login/LoginRepository;Lcom/dysisdemo/ui/login/LoginView;Ljava/lang/String;Ljava/lang/String;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class LoginModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        private final android.app.Application application = null;
        private final com.dysisdemo.ui.login.LoginRepository loginRepository = null;
        private final com.dysisdemo.ui.login.LoginView view = null;
        private final java.lang.String username = null;
        private final java.lang.String password = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public LoginModelFactory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        com.dysisdemo.ui.login.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
        com.dysisdemo.ui.login.LoginView view, @org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            super();
        }
    }
}