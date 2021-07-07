package com.qasim.paging3example.di;

import com.example.common.database.PixabayDatabase;
import com.qasim.paging3example.data.database.dao.PixabayDao;
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
public final class DatabaseModule_ProvidePixabayDaoFactory implements Factory<PixabayDao> {
  private final DatabaseModule module;

  private final Provider<PixabayDatabase> appDatabaseProvider;

  public DatabaseModule_ProvidePixabayDaoFactory(DatabaseModule module,
      Provider<PixabayDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public PixabayDao get() {
    return providePixabayDao(module, appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvidePixabayDaoFactory create(DatabaseModule module,
      Provider<PixabayDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvidePixabayDaoFactory(module, appDatabaseProvider);
  }

  public static PixabayDao providePixabayDao(DatabaseModule instance, PixabayDatabase appDatabase) {
    return Preconditions.checkNotNull(instance.providePixabayDao(appDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
