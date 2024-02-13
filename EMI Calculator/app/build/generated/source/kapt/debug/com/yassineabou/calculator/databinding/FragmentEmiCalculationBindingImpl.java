package com.yassineabou.calculator.databinding;
import com.yassineabou.calculator.R;
import com.yassineabou.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEmiCalculationBindingImpl extends FragmentEmiCalculationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 6);
        sViewsWithIds.put(R.id.labelEmiAmount, 7);
        sViewsWithIds.put(R.id.perMonth, 8);
        sViewsWithIds.put(R.id.labelPrincipal, 9);
        sViewsWithIds.put(R.id.labelInterest, 10);
        sViewsWithIds.put(R.id.lineSeparatorCompare, 11);
        sViewsWithIds.put(R.id.labelCompare, 12);
        sViewsWithIds.put(R.id.lineSeparatorBackground, 13);
        sViewsWithIds.put(R.id.done, 14);
        sViewsWithIds.put(R.id.compare, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEmiCalculationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentEmiCalculationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[6]
            , (android.widget.ImageButton) bindings[15]
            , (android.widget.Button) bindings[14]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.emiAmount.setTag(null);
        this.interest.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.numberInstallments.setTag(null);
        this.principal.setTag(null);
        this.totalAmount.setTag(null);
        setRootTag(root);
        // listeners
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFirstEmiCalculation((kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFirstEmiCalculation(kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> ViewModelFirstEmiCalculation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewModelFirstEmiCalculationNumberInstallments = null;
        java.lang.String stringFormatNumberInstallmentsAndroidStringInstallmentsViewModelFirstEmiCalculationNumberInstallments = null;
        java.lang.String viewModelFirstEmiCalculationInterest = null;
        com.yassineabou.calculator.ui.emi.Emi viewModelFirstEmiCalculationGetValue = null;
        kotlinx.coroutines.flow.StateFlow<com.yassineabou.calculator.ui.emi.Emi> viewModelFirstEmiCalculation = null;
        java.lang.String viewModelFirstEmiCalculationTotalAmount = null;
        com.yassineabou.calculator.ui.emi.EMIViewModel viewModel = mViewModel;
        java.lang.String viewModelFirstEmiCalculationPrincipal = null;
        java.lang.String viewModelFirstEmiCalculationEmiAmount = null;
        java.lang.String stringFormatTotalAmountAndroidStringTotalAmountViewModelFirstEmiCalculationTotalAmount = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.firstEmiCalculation
                    viewModelFirstEmiCalculation = viewModel.getFirstEmiCalculation();
                }
                androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, viewModelFirstEmiCalculation);


                if (viewModelFirstEmiCalculation != null) {
                    // read viewModel.firstEmiCalculation.getValue()
                    viewModelFirstEmiCalculationGetValue = viewModelFirstEmiCalculation.getValue();
                }


                if (viewModelFirstEmiCalculationGetValue != null) {
                    // read viewModel.firstEmiCalculation.getValue().numberInstallments
                    viewModelFirstEmiCalculationNumberInstallments = viewModelFirstEmiCalculationGetValue.getNumberInstallments();
                    // read viewModel.firstEmiCalculation.getValue().interest
                    viewModelFirstEmiCalculationInterest = viewModelFirstEmiCalculationGetValue.getInterest();
                    // read viewModel.firstEmiCalculation.getValue().totalAmount
                    viewModelFirstEmiCalculationTotalAmount = viewModelFirstEmiCalculationGetValue.getTotalAmount();
                    // read viewModel.firstEmiCalculation.getValue().principal
                    viewModelFirstEmiCalculationPrincipal = viewModelFirstEmiCalculationGetValue.getPrincipal();
                    // read viewModel.firstEmiCalculation.getValue().emiAmount
                    viewModelFirstEmiCalculationEmiAmount = viewModelFirstEmiCalculationGetValue.getEmiAmount();
                }


                // read String.format(@android:string/installments, viewModel.firstEmiCalculation.getValue().numberInstallments)
                stringFormatNumberInstallmentsAndroidStringInstallmentsViewModelFirstEmiCalculationNumberInstallments = java.lang.String.format(numberInstallments.getResources().getString(R.string.installments), viewModelFirstEmiCalculationNumberInstallments);
                // read String.format(@android:string/totalAmount, viewModel.firstEmiCalculation.getValue().totalAmount)
                stringFormatTotalAmountAndroidStringTotalAmountViewModelFirstEmiCalculationTotalAmount = java.lang.String.format(totalAmount.getResources().getString(R.string.totalAmount), viewModelFirstEmiCalculationTotalAmount);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emiAmount, viewModelFirstEmiCalculationEmiAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.interest, viewModelFirstEmiCalculationInterest);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.numberInstallments, stringFormatNumberInstallmentsAndroidStringInstallmentsViewModelFirstEmiCalculationNumberInstallments);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.principal, viewModelFirstEmiCalculationPrincipal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalAmount, stringFormatTotalAmountAndroidStringTotalAmountViewModelFirstEmiCalculationTotalAmount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.firstEmiCalculation
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}