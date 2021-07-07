package com.qasim.paging3example.ui.paging;

import com.qasim.paging3example.data.repo.PixabayRepo;
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
public final class PagingViewModel_AssistedFactory_Factory implements Factory<PagingViewModel_AssistedFactory> {
  private final Provider<PixabayRepo> pixabayRepoProvider;

  public PagingViewModel_AssistedFactory_Factory(Provider<PixabayRepo> pixabayRepoProvider) {
    this.pixabayRepoProvider = pixabayRepoProvider;
  }

  @Override
  public PagingViewModel_AssistedFactory get() {
    return newInstance(pixabayRepoProvider);
  }

  public static PagingViewModel_AssistedFactory_Factory create(
      Provider<PixabayRepo> pixabayRepoProvider) {
    return new PagingViewModel_AssistedFactory_Factory(pixabayRepoProvider);
  }

  public static PagingViewModel_AssistedFactory newInstance(Provider<PixabayRepo> pixabayRepo) {
    return new PagingViewModel_AssistedFactory(pixabayRepo);
  }
}
