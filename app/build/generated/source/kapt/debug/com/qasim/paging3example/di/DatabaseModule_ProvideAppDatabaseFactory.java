package com.qasim.paging3example.di;

import android.content.Context;
import com.example.common.database.PixabayDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<PixabayDatabase> {
  private final DatabaseModule module;

  private final Provider<Context> appContextProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(DatabaseModule module,
      Provider<Context> appContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public PixabayDatabase get() {
    return provideAppDatabase(module, appContextProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(DatabaseModule module,
      Provider<Context> appContextProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(module, appContextProvider);
  }

  public static PixabayDatabase provideAppDatabase(DatabaseModule instance, Context appContext) {
    return Preconditions.checkNotNull(instance.provideAppDatabase(appContext), "Cannot return null from a non-@Nullable @Provides method");
  }
}
