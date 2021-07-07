package com.qasim.paging3example.ui.paging;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.qasim.paging3example.data.repo.PixabayRepo;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PagingViewModel_AssistedFactory implements ViewModelAssistedFactory<PagingViewModel> {
  private final Provider<PixabayRepo> pixabayRepo;

  @Inject
  PagingViewModel_AssistedFactory(Provider<PixabayRepo> pixabayRepo) {
    this.pixabayRepo = pixabayRepo;
  }

  @Override
  @NonNull
  public PagingViewModel create(SavedStateHandle arg0) {
    return new PagingViewModel(pixabayRepo.get());
  }
}
