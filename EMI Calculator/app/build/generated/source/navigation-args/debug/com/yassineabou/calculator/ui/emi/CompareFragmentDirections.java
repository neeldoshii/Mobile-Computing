package com.yassineabou.calculator.ui.emi;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.yassineabou.calculator.R;

public class CompareFragmentDirections {
  private CompareFragmentDirections() {
  }

  @NonNull
  public static NavDirections compareFragmentToCalculatorFragment() {
    return new ActionOnlyNavDirections(R.id.compareFragment_to_calculatorFragment);
  }

  @NonNull
  public static NavDirections compareFragmentToEmiCalculator() {
    return new ActionOnlyNavDirections(R.id.compareFragment_to_emiCalculator);
  }
}
