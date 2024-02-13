package com.yassineabou.calculator.ui.calculator;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/yassineabou/calculator/ui/calculator/ListPreviousOperationsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/yassineabou/calculator/data/model/PreviousOperation;", "Lcom/yassineabou/calculator/ui/calculator/ListPreviousOperationsAdapter$ViewHolder;", "previousOperationAction", "Lcom/yassineabou/calculator/ui/calculator/PreviousOperationAction;", "(Lcom/yassineabou/calculator/ui/calculator/PreviousOperationAction;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ListPreviousOperationsAdapter extends androidx.recyclerview.widget.ListAdapter<com.yassineabou.calculator.data.model.PreviousOperation, com.yassineabou.calculator.ui.calculator.ListPreviousOperationsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.yassineabou.calculator.ui.calculator.PreviousOperationAction previousOperationAction = null;
    
    public ListPreviousOperationsAdapter(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.ui.calculator.PreviousOperationAction previousOperationAction) {
        super(null);
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.yassineabou.calculator.ui.calculator.ListPreviousOperationsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.yassineabou.calculator.ui.calculator.ListPreviousOperationsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/yassineabou/calculator/ui/calculator/ListPreviousOperationsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "previousOperationItemBinding", "Lcom/yassineabou/calculator/databinding/PreviousOperationItemBinding;", "(Lcom/yassineabou/calculator/databinding/PreviousOperationItemBinding;)V", "bind", "", "previousOperation", "Lcom/yassineabou/calculator/data/model/PreviousOperation;", "previousOperationAction", "Lcom/yassineabou/calculator/ui/calculator/PreviousOperationAction;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.yassineabou.calculator.databinding.PreviousOperationItemBinding previousOperationItemBinding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.yassineabou.calculator.ui.calculator.ListPreviousOperationsAdapter.ViewHolder.Companion Companion = null;
        
        private ViewHolder(com.yassineabou.calculator.databinding.PreviousOperationItemBinding previousOperationItemBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.yassineabou.calculator.data.model.PreviousOperation previousOperation, @org.jetbrains.annotations.NotNull
        com.yassineabou.calculator.ui.calculator.PreviousOperationAction previousOperationAction) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yassineabou/calculator/ui/calculator/ListPreviousOperationsAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/yassineabou/calculator/ui/calculator/ListPreviousOperationsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.yassineabou.calculator.ui.calculator.ListPreviousOperationsAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}