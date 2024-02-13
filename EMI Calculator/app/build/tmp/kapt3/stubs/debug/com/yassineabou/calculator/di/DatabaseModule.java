package com.yassineabou.calculator.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/yassineabou/calculator/di/DatabaseModule;", "", "()V", "providePreviousOperationDao", "Lcom/yassineabou/calculator/data/local/PreviousOperationDao;", "previousOperationDatabase", "Lcom/yassineabou/calculator/data/local/PreviousOperationDatabase;", "providePreviousOperationDatabase", "app", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.yassineabou.calculator.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.yassineabou.calculator.data.local.PreviousOperationDatabase providePreviousOperationDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context app) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.yassineabou.calculator.data.local.PreviousOperationDao providePreviousOperationDao(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.data.local.PreviousOperationDatabase previousOperationDatabase) {
        return null;
    }
}