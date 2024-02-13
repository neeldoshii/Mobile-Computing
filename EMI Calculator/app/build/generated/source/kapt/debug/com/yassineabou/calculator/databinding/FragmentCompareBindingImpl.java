package com.yassineabou.calculator.databinding;
import com.yassineabou.calculator.R;
import com.yassineabou.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCompareBindingImpl extends FragmentCompareBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.firstBackground, 15);
        sViewsWithIds.put(R.id.compareTable, 16);
        sViewsWithIds.put(R.id.emptyElementRow, 17);
        sViewsWithIds.put(R.id.firstOption, 18);
        sViewsWithIds.put(R.id.secondOption, 19);
        sViewsWithIds.put(R.id.loanAmount, 20);
        sViewsWithIds.put(R.id.emiAmount, 21);
        sViewsWithIds.put(R.id.interestRate, 22);
        sViewsWithIds.put(R.id.numberInstallments, 23);
        sViewsWithIds.put(R.id.lineSeparatorFirstBackground, 24);
        sViewsWithIds.put(R.id.secondBackground, 25);
        sViewsWithIds.put(R.id.labelFirstOption, 26);
        sViewsWithIds.put(R.id.labelFirstPrincipal, 27);
        sViewsWithIds.put(R.id.labelFirstInterest, 28);
        sViewsWithIds.put(R.id.lineSeparatorFirstOption, 29);
        sViewsWithIds.put(R.id.labelSecondOption, 30);
        sViewsWithIds.put(R.id.labelSecondPrincipal, 31);
        sViewsWithIds.put(R.id.labelSecondInterest, 32);
        sViewsWithIds.put(R.id.lineSeparatorSecondBackground, 33);
        sViewsWithIds.put(R.id.done, 34);
        sViewsWithIds.put(R.id.reset, 35);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCompareBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentCompareBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TableLayout) bindings[16]
            , (android.widget.Button) bindings[34]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[17]
            , (android.view.View) bindings[15]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[33]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[23]
            , (android.widget.Button) bindings[35]
            , (android.view.View) bindings[25]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            );
        this.firstEmiAmount.setTag(null);
        this.firstInterest.setTag(null);
        this.firstInterestRate.setTag(null);
        this.firstLoanAmount.setTag(null);
        this.firstNumberInstallments.setTag(null);
        this.firstPrincipal.setTag(null);
        this.firstTotalAmount.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.secondEmiAmount.setTag(null);
        this.secondInterest.setTag(null);
        this.secondInterestRate.setTag(null);
        this.secondLoanAmount.setTag(null);
        this.secondNumberInstallments.setTag(null);
        this.secondPrincipal.setTag(null);
        this.secondTotalAmount.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewModel((com.yassineabou.calculator.ui.emi.EMIViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.yassineabou.calculator.ui.emi.EMIViewModel ViewModel) {
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
                return onChangeViewModelSecondEmiCalculation((kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi>) object, fieldId);
            case 1 :
                return onChangeViewModelFirstEmiCalculation((kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSecondEmiCalculation(kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> ViewModelSecondEmiCalculation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFirstEmiCalculation(kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> ViewModelFirstEmiCalculation, int fieldId) {
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
        java.lang.String viewModelSecondEmiCalculationInterestRate = null;
        java.lang.String viewModelFirstEmiCalculationInterest = null;
        com.yassineabou.calculator.ui.emi.Emi viewModelFirstEmiCalculationGetValue = null;
        java.lang.String viewModelFirstEmiCalculationTotalAmount = null;
        java.lang.String stringFormatSecondTotalAmountAndroidStringTotalAmountViewModelSecondEmiCalculationTotalAmount = null;
        java.lang.String viewModelSecondEmiCalculationNumberInstallments = null;
        java.lang.String viewModelFirstEmiCalculationPrincipal = null;
        java.lang.String viewModelSecondEmiCalculationEmiAmount = null;
        java.lang.String viewModelFirstEmiCalculationNumberInstallments = null;
        kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> viewModelSecondEmiCalculation = null;
        java.lang.String viewModelSecondEmiCalculationTotalAmount = null;
        java.lang.String viewModelFirstEmiCalculationInterestRate = null;
        java.lang.String stringFormatFirstTotalAmountAndroidStringTotalAmountViewModelFirstEmiCalculationTotalAmount = null;
        com.yassineabou.calculator.ui.emi.Emi viewModelSecondEmiCalculationGetValue = null;
        java.lang.String viewModelSecondEmiCalculationInterest = null;
        kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> viewModelFirstEmiCalculation = null;
        com.yassineabou.calculator.ui.emi.EMIViewModel viewModel = mViewModel;
        java.lang.String viewModelSecondEmiCalculationPrincipal = null;
        java.lang.String viewModelFirstEmiCalculationEmiAmount = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.secondEmiCalculation
                        viewModelSecondEmiCalculation = viewModel.getSecondEmiCalculation();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewModelSecondEmiCalculation);


                    if (viewModelSecondEmiCalculation != null) {
                        // read viewModel.secondEmiCalculation.getValue()
                        viewModelSecondEmiCalculationGetValue = viewModelSecondEmiCalculation.getValue();
                    }


                    if (viewModelSecondEmiCalculationGetValue != null) {
                        // read viewModel.secondEmiCalculation.getValue().interestRate
                        viewModelSecondEmiCalculationInterestRate = viewModelSecondEmiCalculationGetValue.getInterestRate();
                        // read viewModel.secondEmiCalculation.getValue().numberInstallments
                        viewModelSecondEmiCalculationNumberInstallments = viewModelSecondEmiCalculationGetValue.getNumberInstallments();
                        // read viewModel.secondEmiCalculation.getValue().emiAmount
                        viewModelSecondEmiCalculationEmiAmount = viewModelSecondEmiCalculationGetValue.getEmiAmount();
                        // read viewModel.secondEmiCalculation.getValue().totalAmount
                        viewModelSecondEmiCalculationTotalAmount = viewModelSecondEmiCalculationGetValue.getTotalAmount();
                        // read viewModel.secondEmiCalculation.getValue().interest
                        viewModelSecondEmiCalculationInterest = viewModelSecondEmiCalculationGetValue.getInterest();
                        // read viewModel.secondEmiCalculation.getValue().principal
                        viewModelSecondEmiCalculationPrincipal = viewModelSecondEmiCalculationGetValue.getPrincipal();
                    }


                    // read String.format(@android:string/totalAmount, viewModel.secondEmiCalculation.getValue().totalAmount)
                    stringFormatSecondTotalAmountAndroidStringTotalAmountViewModelSecondEmiCalculationTotalAmount = java.lang.String.format(secondTotalAmount.getResources().getString(R.string.totalAmount), viewModelSecondEmiCalculationTotalAmount);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.firstEmiCalculation
                        viewModelFirstEmiCalculation = viewModel.getFirstEmiCalculation();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewModelFirstEmiCalculation);


                    if (viewModelFirstEmiCalculation != null) {
                        // read viewModel.firstEmiCalculation.getValue()
                        viewModelFirstEmiCalculationGetValue = viewModelFirstEmiCalculation.getValue();
                    }


                    if (viewModelFirstEmiCalculationGetValue != null) {
                        // read viewModel.firstEmiCalculation.getValue().interest
                        viewModelFirstEmiCalculationInterest = viewModelFirstEmiCalculationGetValue.getInterest();
                        // read viewModel.firstEmiCalculation.getValue().totalAmount
                        viewModelFirstEmiCalculationTotalAmount = viewModelFirstEmiCalculationGetValue.getTotalAmount();
                        // read viewModel.firstEmiCalculation.getValue().principal
                        viewModelFirstEmiCalculationPrincipal = viewModelFirstEmiCalculationGetValue.getPrincipal();
                        // read viewModel.firstEmiCalculation.getValue().numberInstallments
                        viewModelFirstEmiCalculationNumberInstallments = viewModelFirstEmiCalculationGetValue.getNumberInstallments();
                        // read viewModel.firstEmiCalculation.getValue().interestRate
                        viewModelFirstEmiCalculationInterestRate = viewModelFirstEmiCalculationGetValue.getInterestRate();
                        // read viewModel.firstEmiCalculation.getValue().emiAmount
                        viewModelFirstEmiCalculationEmiAmount = viewModelFirstEmiCalculationGetValue.getEmiAmount();
                    }


                    // read String.format(@android:string/totalAmount, viewModel.firstEmiCalculation.getValue().totalAmount)
                    stringFormatFirstTotalAmountAndroidStringTotalAmountViewModelFirstEmiCalculationTotalAmount = java.lang.String.format(firstTotalAmount.getResources().getString(R.string.totalAmount), viewModelFirstEmiCalculationTotalAmount);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstEmiAmount, viewModelFirstEmiCalculationEmiAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstInterest, viewModelFirstEmiCalculationInterest);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstInterestRate, viewModelFirstEmiCalculationInterestRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstLoanAmount, viewModelFirstEmiCalculationPrincipal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstNumberInstallments, viewModelFirstEmiCalculationNumberInstallments);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstPrincipal, viewModelFirstEmiCalculationPrincipal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstTotalAmount, stringFormatFirstTotalAmountAndroidStringTotalAmountViewModelFirstEmiCalculationTotalAmount);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondEmiAmount, viewModelSecondEmiCalculationEmiAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondInterest, viewModelSecondEmiCalculationInterest);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondInterestRate, viewModelSecondEmiCalculationInterestRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondLoanAmount, viewModelSecondEmiCalculationPrincipal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondNumberInstallments, viewModelSecondEmiCalculationNumberInstallments);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondPrincipal, viewModelSecondEmiCalculationPrincipal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondTotalAmount, stringFormatSecondTotalAmountAndroidStringTotalAmountViewModelSecondEmiCalculationTotalAmount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.secondEmiCalculation
        flag 1 (0x2L): viewModel.firstEmiCalculation
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}