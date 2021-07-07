package com.qasim.paging3example.ui.pagingwithroom;

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
public final class PagingWithRoomViewModel_AssistedFactory_Factory implements Factory<PagingWithRoomViewModel_AssistedFactory> {
  private final Provider<PixabayRepo> pixabayRepoProvider;

  public PagingWithRoomViewModel_AssistedFactory_Factory(
      Provider<PixabayRepo> pixabayRepoProvider) {
    this.pixabayRepoProvider = pixabayRepoProvider;
  }

  @Override
  public PagingWithRoomViewModel_AssistedFactory get() {
    return newInstance(pixabayRepoProvider);
  }

  public static PagingWithRoomViewModel_AssistedFactory_Factory create(
      Provider<PixabayRepo> pixabayRepoProvider) {
    return new PagingWithRoomViewModel_AssistedFactory_Factory(pixabayRepoProvider);
  }

  public static PagingWithRoomViewModel_AssistedFactory newInstance(
      Provider<PixabayRepo> pixabayRepo) {
    return new PagingWithRoomViewModel_AssistedFactory(pixabayRepo);
  }
}
