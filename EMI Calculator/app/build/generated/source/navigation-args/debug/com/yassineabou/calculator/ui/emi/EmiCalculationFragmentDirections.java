package com.yassineabou.calculator.ui.emi;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.yassineabou.calculator.R;

public class EmiCalculationFragmentDirections {
  private EmiCalculationFragmentDirections() {
  }

  @NonNull
  public static NavDirections emiCalculationToEmiCalculator() {
    return new ActionOnlyNavDirections(R.id.emiCalculation_to_emiCalculator);
  }

  @NonNull
  public static NavDirections emiCalculationToCalculatorFragment() {
    return new ActionOnlyNavDirections(R.id.emiCalculation_to_calculatorFragment);
  }
}
