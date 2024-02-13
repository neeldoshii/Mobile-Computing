package com.yassineabou.calculator.ui.emi;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/yassineabou/calculator/ui/emi/EMIViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_emiCalculatorState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yassineabou/calculator/ui/emi/EmiCalculatorState;", "_firstEmiCalculation", "Lcom/yassineabou/calculator/ui/emi/Emi;", "_secondEmiCalculation", "emiCalculatorState", "Lkotlinx/coroutines/flow/StateFlow;", "getEmiCalculatorState", "()Lkotlinx/coroutines/flow/StateFlow;", "firstEmiCalculation", "getFirstEmiCalculation", "secondEmiCalculation", "getSecondEmiCalculation", "calculateEmi", "", "loanAmount", "", "interestRate", "numberInstallments", "updateEmiCalculatorState", "app_debug"})
public final class EMIViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.yassineabou.calculator.ui.emi.EmiCalculatorState> _emiCalculatorState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.EmiCalculatorState> emiCalculatorState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.yassineabou.calculator.ui.emi.Emi> _firstEmiCalculation = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> firstEmiCalculation = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.yassineabou.calculator.ui.emi.Emi> _secondEmiCalculation = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> secondEmiCalculation = null;
    
    public EMIViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.EmiCalculatorState> getEmiCalculatorState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> getFirstEmiCalculation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> getSecondEmiCalculation() {
        return null;
    }
    
    public final void updateEmiCalculatorState(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.ui.emi.EmiCalculatorState emiCalculatorState) {
    }
    
    public final void calculateEmi(double loanAmount, double interestRate, double numberInstallments) {
    }
}