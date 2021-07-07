package com.qasim.paging3example.data.repo;

import com.example.common.database.PixabayDatabase;
import com.qasim.paging3example.data.WebService;
import dagger.internal.Factory;
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
public final class PixabayRepo_Factory implements Factory<PixabayRepo> {
  private final Provider<WebService> pixaBayServiceProvider;

  private final Provider<PixabayDatabase> pixaBayDatabaseProvider;

  public PixabayRepo_Factory(Provider<WebService> pixaBayServiceProvider,
      Provider<PixabayDatabase> pixaBayDatabaseProvider) {
    this.pixaBayServiceProvider = pixaBayServiceProvider;
    this.pixaBayDatabaseProvider = pixaBayDatabaseProvider;
  }

  @Override
  public PixabayRepo get() {
    return newInstance(pixaBayServiceProvider.get(), pixaBayDatabaseProvider.get());
  }

  public static PixabayRepo_Factory create(Provider<WebService> pixaBayServiceProvider,
      Provider<PixabayDatabase> pixaBayDatabaseProvider) {
    return new PixabayRepo_Factory(pixaBayServiceProvider, pixaBayDatabaseProvider);
  }

  public static PixabayRepo newInstance(WebService pixaBayService,
      PixabayDatabase pixaBayDatabase) {
    return new PixabayRepo(pixaBayService, pixaBayDatabase);
  }
}
