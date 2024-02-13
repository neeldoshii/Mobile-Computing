package com.yassineabou.calculator.databinding;
import com.yassineabou.calculator.R;
import com.yassineabou.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCalculatorBindingImpl extends FragmentCalculatorBinding implements com.yassineabou.calculator.generated.callback.OnClickListener.Listener, com.yassineabou.calculator.generated.callback.OnTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.history, 25);
        sViewsWithIds.put(R.id.scientificMode, 26);
        sViewsWithIds.put(R.id.emiCalculator, 27);
        sViewsWithIds.put(R.id.lineSeparatorCalculator, 28);
        sViewsWithIds.put(R.id.normal_mode_group, 29);
        sViewsWithIds.put(R.id.historyGroup, 30);
        sViewsWithIds.put(R.id.LineSeparatorHistory, 31);
        sViewsWithIds.put(R.id.listPreviousOperations, 32);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCalculatorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private FragmentCalculatorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , null
            , (android.view.View) bindings[31]
            , null
            , null
            , (android.widget.ImageButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (android.widget.Button) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , null
            , null
            , null
            , (androidx.appcompat.widget.AppCompatButton) bindings[23]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , null
            , (android.widget.ImageButton) bindings[27]
            , (androidx.appcompat.widget.AppCompatButton) bindings[24]
            , null
            , null
            , null
            , (android.widget.ImageButton) bindings[25]
            , (androidx.constraintlayout.widget.Group) bindings[30]
            , null
            , null
            , null
            , (android.widget.TextView) bindings[1]
            , null
            , null
            , null
            , null
            , null
            , null
            , null
            , (android.view.View) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[32]
            , null
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (androidx.appcompat.widget.AppCompatButton) bindings[21]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , null
            , null
            , (androidx.constraintlayout.widget.Group) bindings[29]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[19]
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (androidx.appcompat.widget.AppCompatButton) bindings[22]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , null
            , (androidx.appcompat.widget.AppCompatButton) bindings[20]
            , null
            , (android.widget.TextView) bindings[2]
            , null
            , (android.widget.ImageButton) bindings[26]
            , null
            , null
            , null
            , null
            , null
            , null
            );
        this.backspace.setTag(null);
        this.brackets.setTag(null);
        this.clearHistory.setTag(null);
        this.clearInput.setTag(null);
        this.decimalPoint.setTag(null);
        this.division.setTag(null);
        this.equal.setTag(null);
        this.input.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.minus.setTag(null);
        this.minusSign.setTag(null);
        this.multiplication.setTag(null);
        this.numberEight.setTag(null);
        this.numberFive.setTag(null);
        this.numberFour.setTag(null);
        this.numberNine.setTag(null);
        this.numberOne.setTag(null);
        this.numberSeven.setTag(null);
        this.numberSix.setTag(null);
        this.numberThree.setTag(null);
        this.numberTwo.setTag(null);
        this.numberZero.setTag(null);
        this.percentage.setTag(null);
        this.plus.setTag(null);
        this.result.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 15);
        mCallback23 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 23);
        mCallback11 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 11);
        mCallback19 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 19);
        mCallback6 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 6);
        mCallback2 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 16);
        mCallback12 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 12);
        mCallback9 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 9);
        mCallback5 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 5);
        mCallback1 = new com.yassineabou.calculator.generated.callback.OnTextChanged(this, 1);
        mCallback17 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 17);
        mCallback13 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 13);
        mCallback21 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 21);
        mCallback8 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 8);
        mCallback4 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 4);
        mCallback20 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 20);
        mCallback14 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 14);
        mCallback10 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 10);
        mCallback22 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 22);
        mCallback18 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 18);
        mCallback7 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 7);
        mCallback3 = new com.yassineabou.calculator.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.yassineabou.calculator.ui.calculator.CalculatorViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.yassineabou.calculator.ui.calculator.CalculatorViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelInput((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelResult((kotlinx.coroutines.flow.StateFlow<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelInput(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelResult(kotlinx.coroutines.flow.StateFlow<java.lang.String> ViewModelResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelInput = null;
        java.lang.String viewModelInputGetValue = null;
        kotlinx.coroutines.flow.StateFlow<java.lang.String> viewModelResult = null;
        java.lang.String viewModelResultGetValue = null;
        com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.input
                        viewModelInput = viewModel.getInput();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewModelInput);


                    if (viewModelInput != null) {
                        // read viewModel.input.getValue()
                        viewModelInputGetValue = viewModelInput.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.result
                        viewModelResult = viewModel.getResult();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewModelResult);


                    if (viewModelResult != null) {
                        // read viewModel.result.getValue()
                        viewModelResultGetValue = viewModelResult.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.backspace.setOnClickListener(mCallback2);
            this.brackets.setOnClickListener(mCallback5);
            this.clearHistory.setOnClickListener(mCallback3);
            this.clearInput.setOnClickListener(mCallback4);
            this.decimalPoint.setOnClickListener(mCallback22);
            this.division.setOnClickListener(mCallback7);
            this.equal.setOnClickListener(mCallback23);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.input, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback1, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            this.minus.setOnClickListener(mCallback15);
            this.minusSign.setOnClickListener(mCallback20);
            this.multiplication.setOnClickListener(mCallback11);
            this.numberEight.setOnClickListener(mCallback9);
            this.numberFive.setOnClickListener(mCallback13);
            this.numberFour.setOnClickListener(mCallback12);
            this.numberNine.setOnClickListener(mCallback10);
            this.numberOne.setOnClickListener(mCallback16);
            this.numberSeven.setOnClickListener(mCallback8);
            this.numberSix.setOnClickListener(mCallback14);
            this.numberThree.setOnClickListener(mCallback18);
            this.numberTwo.setOnClickListener(mCallback17);
            this.numberZero.setOnClickListener(mCallback21);
            this.percentage.setOnClickListener(mCallback6);
            this.plus.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.input, viewModelInputGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.result, viewModelResultGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 15: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendArithmetic(minus.getResources().getString(R.string.minus));
                }
                break;
            }
            case 23: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.insert();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendArithmetic(multiplication.getResources().getString(R.string.multiplication));
                }
                break;
            }
            case 19: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendArithmetic(plus.getResources().getString(R.string.plus));
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.appendPercentage();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.removeLastInputChar();
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberOne.getResources().getString(R.string.numberOne));
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberFour.getResources().getString(R.string.numberFour));
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberEight.getResources().getString(R.string.numberEight));
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.appendBrackets();
                }
                break;
            }
            case 17: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberTwo.getResources().getString(R.string.numberTwo));
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberFive.getResources().getString(R.string.numberFive));
                }
                break;
            }
            case 21: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberZero.getResources().getString(R.string.numberZero));
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberSeven.getResources().getString(R.string.numberSeven));
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clearInput();
                }
                break;
            }
            case 20: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.appendMinusSign();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberSix.getResources().getString(R.string.numberSix));
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberNine.getResources().getString(R.string.numberNine));
                }
                break;
            }
            case 22: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.appendDecimalPoint();
                }
                break;
            }
            case 18: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendNumber(numberThree.getResources().getString(R.string.numberThree));
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.appendArithmetic(division.getResources().getString(R.string.division));
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.clearListPreviousOperations()
                kotlinx.coroutines.Job viewModelClearListPreviousOperations = null;
                // viewModel
                com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelClearListPreviousOperations = viewModel.clearListPreviousOperations();
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        // localize variables for thread safety
        // viewModel
        com.yassineabou.calculator.ui.calculator.CalculatorViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.calculateInput();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.input
        flag 1 (0x2L): viewModel.result
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}