package com.qasim.paging3example.ui.pagingwithroom;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.qasim.paging3example.data.repo.PixabayRepo;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PagingWithRoomViewModel_AssistedFactory implements ViewModelAssistedFactory<PagingWithRoomViewModel> {
  private final Provider<PixabayRepo> pixabayRepo;

  @Inject
  PagingWithRoomViewModel_AssistedFactory(Provider<PixabayRepo> pixabayRepo) {
    this.pixabayRepo = pixabayRepo;
  }

  @Override
  @NonNull
  public PagingWithRoomViewModel create(SavedStateHandle arg0) {
    return new PagingWithRoomViewModel(pixabayRepo.get());
  }
}
