package com.yassineabou.calculator;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.yassineabou.calculator.databinding.ActivityMainBindingImpl;
import com.yassineabou.calculator.databinding.FragmentCalculatorBindingImpl;
import com.yassineabou.calculator.databinding.FragmentCalculatorBindingLandImpl;
import com.yassineabou.calculator.databinding.FragmentCompareBindingImpl;
import com.yassineabou.calculator.databinding.FragmentEmiCalculationBindingImpl;
import com.yassineabou.calculator.databinding.FragmentEmiCalculatorBindingImpl;
import com.yassineabou.calculator.databinding.PreviousOperationItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCALCULATOR = 2;

  private static final int LAYOUT_FRAGMENTCOMPARE = 3;

  private static final int LAYOUT_FRAGMENTEMICALCULATION = 4;

  private static final int LAYOUT_FRAGMENTEMICALCULATOR = 5;

  private static final int LAYOUT_PREVIOUSOPERATIONITEM = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassineabou.calculator.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassineabou.calculator.R.layout.fragment_calculator, LAYOUT_FRAGMENTCALCULATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassineabou.calculator.R.layout.fragment_compare, LAYOUT_FRAGMENTCOMPARE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassineabou.calculator.R.layout.fragment_emi_calculation, LAYOUT_FRAGMENTEMICALCULATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassineabou.calculator.R.layout.fragment_emi_calculator, LAYOUT_FRAGMENTEMICALCULATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassineabou.calculator.R.layout.previous_operation_item, LAYOUT_PREVIOUSOPERATIONITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCALCULATOR: {
          if ("layout/fragment_calculator_0".equals(tag)) {
            return new FragmentCalculatorBindingImpl(component, view);
          }
          if ("layout-land/fragment_calculator_0".equals(tag)) {
            return new FragmentCalculatorBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_calculator is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOMPARE: {
          if ("layout/fragment_compare_0".equals(tag)) {
            return new FragmentCompareBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_compare is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEMICALCULATION: {
          if ("layout/fragment_emi_calculation_0".equals(tag)) {
            return new FragmentEmiCalculationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_emi_calculation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEMICALCULATOR: {
          if ("layout/fragment_emi_calculator_0".equals(tag)) {
            return new FragmentEmiCalculatorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_emi_calculator is invalid. Received: " + tag);
        }
        case  LAYOUT_PREVIOUSOPERATIONITEM: {
          if ("layout/previous_operation_item_0".equals(tag)) {
            return new PreviousOperationItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for previous_operation_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "previousOperation");
      sKeys.put(2, "previousOperationActions");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.yassineabou.calculator.R.layout.activity_main);
      sKeys.put("layout/fragment_calculator_0", com.yassineabou.calculator.R.layout.fragment_calculator);
      sKeys.put("layout-land/fragment_calculator_0", com.yassineabou.calculator.R.layout.fragment_calculator);
      sKeys.put("layout/fragment_compare_0", com.yassineabou.calculator.R.layout.fragment_compare);
      sKeys.put("layout/fragment_emi_calculation_0", com.yassineabou.calculator.R.layout.fragment_emi_calculation);
      sKeys.put("layout/fragment_emi_calculator_0", com.yassineabou.calculator.R.layout.fragment_emi_calculator);
      sKeys.put("layout/previous_operation_item_0", com.yassineabou.calculator.R.layout.previous_operation_item);
    }
  }
}
