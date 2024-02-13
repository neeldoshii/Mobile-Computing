package com.yassineabou.calculator.ui.calculator;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.yassineabou.calculator.R;

public class CalculatorFragmentDirections {
  private CalculatorFragmentDirections() {
  }

  @NonNull
  public static NavDirections calculatorFragmentToEmiCalculator() {
    return new ActionOnlyNavDirections(R.id.calculatorFragment_to_emiCalculator);
  }
}
