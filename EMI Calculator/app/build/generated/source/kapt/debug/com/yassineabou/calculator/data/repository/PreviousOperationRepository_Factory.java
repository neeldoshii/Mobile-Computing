package com.yassineabou.calculator.data.repository;

import com.yassineabou.calculator.data.local.PreviousOperationDao;
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
public final class PreviousOperationRepository_Factory implements Factory<PreviousOperationRepository> {
  private final Provider<PreviousOperationDao> previousOperationDaoProvider;

  public PreviousOperationRepository_Factory(
      Provider<PreviousOperationDao> previousOperationDaoProvider) {
    this.previousOperationDaoProvider = previousOperationDaoProvider;
  }

  @Override
  public PreviousOperationRepository get() {
    return newInstance(previousOperationDaoProvider.get());
  }

  public static PreviousOperationRepository_Factory create(
      Provider<PreviousOperationDao> previousOperationDaoProvider) {
    return new PreviousOperationRepository_Factory(previousOperationDaoProvider);
  }

  public static PreviousOperationRepository newInstance(PreviousOperationDao previousOperationDao) {
    return new PreviousOperationRepository(previousOperationDao);
  }
}
