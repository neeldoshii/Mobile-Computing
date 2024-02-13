package com.yassineabou.calculator.ui.calculator;

import com.yassineabou.calculator.data.repository.PreviousOperationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CalculatorViewModel_Factory implements Factory<CalculatorViewModel> {
  private final Provider<PreviousOperationRepository> previousOperationRepositoryProvider;

  public CalculatorViewModel_Factory(
      Provider<PreviousOperationRepository> previousOperationRepositoryProvider) {
    this.previousOperationRepositoryProvider = previousOperationRepositoryProvider;
  }

  @Override
  public CalculatorViewModel get() {
    return newInstance(previousOperationRepositoryProvider.get());
  }

  public static CalculatorViewModel_Factory create(
      Provider<PreviousOperationRepository> previousOperationRepositoryProvider) {
    return new CalculatorViewModel_Factory(previousOperationRepositoryProvider);
  }

  public static CalculatorViewModel newInstance(
      PreviousOperationRepository previousOperationRepository) {
    return new CalculatorViewModel(previousOperationRepository);
  }
}
