package com.yassineabou.calculator.di;

import com.yassineabou.calculator.data.local.PreviousOperationDao;
import com.yassineabou.calculator.data.local.PreviousOperationDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DatabaseModule_ProvidePreviousOperationDaoFactory implements Factory<PreviousOperationDao> {
  private final Provider<PreviousOperationDatabase> previousOperationDatabaseProvider;

  public DatabaseModule_ProvidePreviousOperationDaoFactory(
      Provider<PreviousOperationDatabase> previousOperationDatabaseProvider) {
    this.previousOperationDatabaseProvider = previousOperationDatabaseProvider;
  }

  @Override
  public PreviousOperationDao get() {
    return providePreviousOperationDao(previousOperationDatabaseProvider.get());
  }

  public static DatabaseModule_ProvidePreviousOperationDaoFactory create(
      Provider<PreviousOperationDatabase> previousOperationDatabaseProvider) {
    return new DatabaseModule_ProvidePreviousOperationDaoFactory(previousOperationDatabaseProvider);
  }

  public static PreviousOperationDao providePreviousOperationDao(
      PreviousOperationDatabase previousOperationDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providePreviousOperationDao(previousOperationDatabase));
  }
}
