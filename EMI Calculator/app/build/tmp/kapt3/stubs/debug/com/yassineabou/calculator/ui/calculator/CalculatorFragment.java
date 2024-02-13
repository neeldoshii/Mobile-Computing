package com.yassineabou.calculator.ui.calculator;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u001a\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010\'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u001bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006*"}, d2 = {"Lcom/yassineabou/calculator/ui/calculator/CalculatorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/yassineabou/calculator/ui/calculator/ListPreviousOperationsAdapter;", "getAdapter", "()Lcom/yassineabou/calculator/ui/calculator/ListPreviousOperationsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "calculatorViewModel", "Lcom/yassineabou/calculator/ui/calculator/CalculatorViewModel;", "getCalculatorViewModel", "()Lcom/yassineabou/calculator/ui/calculator/CalculatorViewModel;", "calculatorViewModel$delegate", "emiViewModel", "Lcom/yassineabou/calculator/ui/emi/EMIViewModel;", "getEmiViewModel", "()Lcom/yassineabou/calculator/ui/emi/EMIViewModel;", "emiViewModel$delegate", "fragmentCalculatorBinding", "Lcom/yassineabou/calculator/databinding/FragmentCalculatorBinding;", "kotlin.jvm.PlatformType", "getFragmentCalculatorBinding", "()Lcom/yassineabou/calculator/databinding/FragmentCalculatorBinding;", "fragmentCalculatorBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "changeGroupFunctionsVisibility", "", "changeHistoryVisibility", "disableHistoryButton", "enableHistoryButton", "hideHistoryGroup", "navigateToEmiCalculator", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showFirstGroupFunctions", "showHistoryGroup", "showInvalidFormat", "showSecondGroupFunctions", "app_debug"})
public final class CalculatorFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy calculatorViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy emiViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadOnlyProperty fragmentCalculatorBinding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy adapter$delegate = null;
    
    public CalculatorFragment() {
        super();
    }
    
    private final com.yassineabou.calculator.ui.calculator.CalculatorViewModel getCalculatorViewModel() {
        return null;
    }
    
    private final com.yassineabou.calculator.ui.emi.EMIViewModel getEmiViewModel() {
        return null;
    }
    
    private final com.yassineabou.calculator.databinding.FragmentCalculatorBinding getFragmentCalculatorBinding() {
        return null;
    }
    
    private final com.yassineabou.calculator.ui.calculator.ListPreviousOperationsAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void changeGroupFunctionsVisibility() {
    }
    
    private final void enableHistoryButton() {
    }
    
    private final void disableHistoryButton() {
    }
    
    private final void showInvalidFormat() {
    }
    
    private final void showFirstGroupFunctions() {
    }
    
    private final void showSecondGroupFunctions() {
    }
    
    private final void changeHistoryVisibility() {
    }
    
    private final void hideHistoryGroup() {
    }
    
    private final void showHistoryGroup() {
    }
    
    private final void navigateToEmiCalculator() {
    }
}