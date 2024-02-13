package com.yassineabou.calculator.util;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001aa\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0007\"\b\b\u0001\u0010\b*\u00020\u0007\"\b\b\u0002\u0010\u0005*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u0001H\u00062\b\u0010\n\u001a\u0004\u0018\u0001H\b2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\fH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u001a\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u001a\n\u0010\u0010\u001a\u00020\u0003*\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0013\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0003\u001a\u0016\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007\u001a\u0016\u0010\u001b\u001a\u00020\u0017*\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001c"}, d2 = {"isBalancedBrackets", "", "str", "", "safeLet", "R", "T1", "", "T2", "p1", "p2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "trimTrailingZero", "value", "decimalFormat", "", "isDarkMode", "Landroid/content/Context;", "parseDouble", "", "setInput", "", "Landroid/widget/TextView;", "previousOperation", "Lcom/yassineabou/calculator/data/model/PreviousOperation;", "setResult", "app_debug"})
public final class ExtensionsKt {
    
    @androidx.databinding.BindingAdapter(value = {"setInput"})
    public static final void setInput(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setInput, @org.jetbrains.annotations.Nullable
    com.yassineabou.calculator.data.model.PreviousOperation previousOperation) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setResult"})
    public static final void setResult(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setResult, @org.jetbrains.annotations.Nullable
    com.yassineabou.calculator.data.model.PreviousOperation previousOperation) {
    }
    
    public static final boolean isDarkMode(@org.jetbrains.annotations.NotNull
    android.content.Context $this$isDarkMode) {
        return false;
    }
    
    public static final double parseDouble(@org.jetbrains.annotations.NotNull
    java.lang.String $this$parseDouble) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object, R extends java.lang.Object>R safeLet(@org.jetbrains.annotations.Nullable
    T1 p1, @org.jetbrains.annotations.Nullable
    T2 p2, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends R> block) {
        return null;
    }
    
    public static final boolean isBalancedBrackets(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String decimalFormat(@org.jetbrains.annotations.NotNull
    java.lang.Number $this$decimalFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String trimTrailingZero(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
        return null;
    }
}