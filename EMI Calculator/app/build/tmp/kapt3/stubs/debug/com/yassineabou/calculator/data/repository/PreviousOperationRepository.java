package com.yassineabou.calculator.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/yassineabou/calculator/data/repository/PreviousOperationRepository;", "", "previousOperationDao", "Lcom/yassineabou/calculator/data/local/PreviousOperationDao;", "(Lcom/yassineabou/calculator/data/local/PreviousOperationDao;)V", "listPreviousOperationsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yassineabou/calculator/data/model/PreviousOperation;", "getListPreviousOperationsFlow", "()Lkotlinx/coroutines/flow/Flow;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "previousOperation", "(Lcom/yassineabou/calculator/data/model/PreviousOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PreviousOperationRepository {
    @org.jetbrains.annotations.NotNull
    private final com.yassineabou.calculator.data.local.PreviousOperationDao previousOperationDao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.yassineabou.calculator.data.model.PreviousOperation>> listPreviousOperationsFlow = null;
    
    @javax.inject.Inject
    public PreviousOperationRepository(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.data.local.PreviousOperationDao previousOperationDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.yassineabou.calculator.data.model.PreviousOperation>> getListPreviousOperationsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.data.model.PreviousOperation previousOperation, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}