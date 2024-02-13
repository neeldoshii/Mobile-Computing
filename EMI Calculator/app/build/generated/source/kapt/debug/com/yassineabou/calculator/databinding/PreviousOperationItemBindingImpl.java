package com.yassineabou.calculator.databinding;
import com.yassineabou.calculator.R;
import com.yassineabou.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreviousOperationItemBindingImpl extends PreviousOperationItemBinding implements com.yassineabou.calculator.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback76;
    @Nullable
    private final android.view.View.OnClickListener mCallback75;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PreviousOperationItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private PreviousOperationItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.input.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.result.setTag(null);
        setRootTag(root);
        // listeners
        mCallback76 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 2);
        mCallback75 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.previousOperationActions == variableId) {
            setPreviousOperationActions((com.yassineabou.calculator.ui.calculator.PreviousOperationAction) variable);
        }
        else if (BR.previousOperation == variableId) {
            setPreviousOperation((com.yassineabou.calculator.data.model.PreviousOperation) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPreviousOperationActions(@Nullable com.yassineabou.calculator.ui.calculator.PreviousOperationAction PreviousOperationActions) {
        this.mPreviousOperationActions = PreviousOperationActions;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.previousOperationActions);
        super.requestRebind();
    }
    public void setPreviousOperation(@Nullable com.yassineabou.calculator.data.model.PreviousOperation PreviousOperation) {
        this.mPreviousOperation = PreviousOperation;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.previousOperation);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.yassineabou.calculator.ui.calculator.PreviousOperationAction previousOperationActions = mPreviousOperationActions;
        com.yassineabou.calculator.data.model.PreviousOperation previousOperation = mPreviousOperation;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.yassineabou.calculator.util.ExtensionsKt.setInput(this.input, previousOperation);
            com.yassineabou.calculator.util.ExtensionsKt.setResult(this.result, previousOperation);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.input.setOnClickListener(mCallback75);
            this.result.setOnClickListener(mCallback76);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // previousOperation.result
                java.lang.String previousOperationResult = null;
                // previousOperationActions != null
                boolean previousOperationActionsJavaLangObjectNull = false;
                // previousOperationActions
                com.yassineabou.calculator.ui.calculator.PreviousOperationAction previousOperationActions = mPreviousOperationActions;
                // previousOperation
                com.yassineabou.calculator.data.model.PreviousOperation previousOperation = mPreviousOperation;
                // previousOperation != null
                boolean previousOperationJavaLangObjectNull = false;



                previousOperationActionsJavaLangObjectNull = (previousOperationActions) != (null);
                if (previousOperationActionsJavaLangObjectNull) {



                    previousOperationJavaLangObjectNull = (previousOperation) != (null);
                    if (previousOperationJavaLangObjectNull) {


                        previousOperationResult = previousOperation.getResult();

                        previousOperationActions.appendNumberFromHistory(previousOperationResult);
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // previousOperationActions != null
                boolean previousOperationActionsJavaLangObjectNull = false;
                // previousOperationActions
                com.yassineabou.calculator.ui.calculator.PreviousOperationAction previousOperationActions = mPreviousOperationActions;
                // previousOperation
                com.yassineabou.calculator.data.model.PreviousOperation previousOperation = mPreviousOperation;
                // previousOperation != null
                boolean previousOperationJavaLangObjectNull = false;
                // previousOperation.input
                java.lang.String previousOperationInput = null;



                previousOperationActionsJavaLangObjectNull = (previousOperationActions) != (null);
                if (previousOperationActionsJavaLangObjectNull) {



                    previousOperationJavaLangObjectNull = (previousOperation) != (null);
                    if (previousOperationJavaLangObjectNull) {


                        previousOperationInput = previousOperation.getInput();

                        previousOperationActions.appendNumberFromHistory(previousOperationInput);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): previousOperationActions
        flag 1 (0x2L): previousOperation
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}