package com.yassineabou.calculator.ui.emi;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.yassineabou.calculator.R;

public class EmiCalculatorFragmentDirections {
  private EmiCalculatorFragmentDirections() {
  }

  @NonNull
  public static NavDirections emiCalculatorToCompareFragment() {
    return new ActionOnlyNavDirections(R.id.emiCalculator_to_compareFragment);
  }

  @NonNull
  public static NavDirections emiCalculatorToEmiCalculation() {
    return new ActionOnlyNavDirections(R.id.emiCalculator_to_emiCalculation);
  }
}
