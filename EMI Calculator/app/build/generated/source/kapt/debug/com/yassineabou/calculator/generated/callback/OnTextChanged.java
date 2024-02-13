package com.yassineabou.calculator.generated.callback;
public final class OnTextChanged implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged {
    final Listener mListener;
    final int mSourceId;
    public OnTextChanged(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onTextChanged(java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        mListener._internalCallbackOnTextChanged(mSourceId , callbackArg_0, callbackArg_1, callbackArg_2, callbackArg_3);
    }
    public interface Listener {
        void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3);
    }
}