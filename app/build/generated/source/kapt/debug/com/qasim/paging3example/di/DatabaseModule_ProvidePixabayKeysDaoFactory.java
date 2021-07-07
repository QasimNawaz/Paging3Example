package com.qasim.paging3example.di;

import com.example.common.database.PixabayDatabase;
import com.example.common.database.dao.PixabayKeyDao;
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
public final class DatabaseModule_ProvidePixabayKeysDaoFactory implements Factory<PixabayKeyDao> {
  private final DatabaseModule module;

  private final Provider<PixabayDatabase> appDatabaseProvider;

  public DatabaseModule_ProvidePixabayKeysDaoFactory(DatabaseModule module,
      Provider<PixabayDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public PixabayKeyDao get() {
    return providePixabayKeysDao(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvidePixabayKeysDaoFactory create(DatabaseModule module,
      Provider<PixabayDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvidePixabayKeysDaoFactory(module, appDatabaseProvider);
  }

  public static PixabayKeyDao providePixabayKeysDao(DatabaseModule instance,
      PixabayDatabase appDatabase) {
    return Preconditions.checkNotNull(instance.providePixabayKeysDao(appDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
