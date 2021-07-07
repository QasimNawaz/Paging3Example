package com.qasim.paging3example.ui.paging;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = PagingViewModel.class
)
public interface PagingViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.qasim.paging3example.ui.paging.PagingViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(PagingViewModel_AssistedFactory factory);
}
