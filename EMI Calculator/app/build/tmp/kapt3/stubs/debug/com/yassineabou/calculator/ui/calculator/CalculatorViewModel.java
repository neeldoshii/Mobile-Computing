package com.yassineabou.calculator.ui.calculator;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\tJ\u0006\u0010&\u001a\u00020!J\u000e\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\tJ\u0006\u0010*\u001a\u00020!J\u000e\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\tJ\u0006\u0010-\u001a\u00020!J\u0006\u0010.\u001a\u00020!J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020!J\u0006\u00102\u001a\u00020!J\u000e\u00103\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0007J\u000e\u00104\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u00105\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00160\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010\u00a8\u00066"}, d2 = {"Lcom/yassineabou/calculator/ui/calculator/CalculatorViewModel;", "Landroidx/lifecycle/ViewModel;", "previousOperationRepository", "Lcom/yassineabou/calculator/data/repository/PreviousOperationRepository;", "(Lcom/yassineabou/calculator/data/repository/PreviousOperationRepository;)V", "_calculatorState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yassineabou/calculator/ui/calculator/CalculatorState;", "_input", "", "_result", "arithmeticSymbol", "", "calculatorState", "Lkotlinx/coroutines/flow/StateFlow;", "getCalculatorState", "()Lkotlinx/coroutines/flow/StateFlow;", "input", "getInput", "isDecimalPointClicked", "", "listArithmeticSymbols", "", "listChars", "listNumbers", "listPreviousOperationsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/yassineabou/calculator/data/model/PreviousOperation;", "getListPreviousOperationsFlow", "()Lkotlinx/coroutines/flow/Flow;", "result", "getResult", "appendArithmetic", "", "appendBrackets", "appendDecimalPoint", "appendFunction", "function", "appendMinusSign", "appendNumber", "number", "appendNumberFromHistory", "appendPercentage", "appendPower", "power", "calculateInput", "clearInput", "clearListPreviousOperations", "Lkotlinx/coroutines/Job;", "insert", "removeLastInputChar", "updateCalculatorState", "updateInput", "updateResult", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CalculatorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.yassineabou.calculator.data.repository.PreviousOperationRepository previousOperationRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.yassineabou.calculator.data.model.PreviousOperation>> listPreviousOperationsFlow = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Character> listChars = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Character> listArithmeticSymbols = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Character> listNumbers = null;
    private boolean isDecimalPointClicked = true;
    private char arithmeticSymbol = '+';
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _input = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> input = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _result = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> result = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.yassineabou.calculator.ui.calculator.CalculatorState> _calculatorState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.calculator.CalculatorState> calculatorState = null;
    
    @javax.inject.Inject
    public CalculatorViewModel(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.data.repository.PreviousOperationRepository previousOperationRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.yassineabou.calculator.data.model.PreviousOperation>> getListPreviousOperationsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.calculator.CalculatorState> getCalculatorState() {
        return null;
    }
    
    public final void updateInput(@org.jetbrains.annotations.NotNull
    java.lang.String input) {
    }
    
    public final void updateResult(@org.jetbrains.annotations.NotNull
    java.lang.String result) {
    }
    
    public final void updateCalculatorState(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.ui.calculator.CalculatorState calculatorState) {
    }
    
    public final void appendNumberFromHistory(@org.jetbrains.annotations.NotNull
    java.lang.String number) {
    }
    
    public final void appendFunction(@org.jetbrains.annotations.NotNull
    java.lang.String function) {
    }
    
    public final void appendPower(@org.jetbrains.annotations.NotNull
    java.lang.String power) {
    }
    
    public final void calculateInput() {
    }
    
    public final void removeLastInputChar() {
    }
    
    public final void appendDecimalPoint() {
    }
    
    public final void clearInput() {
    }
    
    public final void appendMinusSign() {
    }
    
    public final void appendBrackets() {
    }
    
    public final void insert() {
    }
    
    public final void appendPercentage() {
    }
    
    public final void appendNumber(@org.jetbrains.annotations.NotNull
    java.lang.String number) {
    }
    
    public final void appendArithmetic(@org.jetbrains.annotations.NotNull
    java.lang.String arithmeticSymbol) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job clearListPreviousOperations() {
        return null;
    }
}