package com.yassineabou.calculator.di;

import android.content.Context;
import com.yassineabou.calculator.data.local.PreviousOperationDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DatabaseModule_ProvidePreviousOperationDatabaseFactory implements Factory<PreviousOperationDatabase> {
  private final Provider<Context> appProvider;

  public DatabaseModule_ProvidePreviousOperationDatabaseFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public PreviousOperationDatabase get() {
    return providePreviousOperationDatabase(appProvider.get());
  }

  public static DatabaseModule_ProvidePreviousOperationDatabaseFactory create(
      Provider<Context> appProvider) {
    return new DatabaseModule_ProvidePreviousOperationDatabaseFactory(appProvider);
  }

  public static PreviousOperationDatabase providePreviousOperationDatabase(Context app) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providePreviousOperationDatabase(app));
  }
}
