package com.qasim.paging3example.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppContextModule_GetApplicationContextFactory implements Factory<Context> {
  private final AppContextModule module;

  public AppContextModule_GetApplicationContextFactory(AppContextModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return getApplicationContext(module);
  }

  public static AppContextModule_GetApplicationContextFactory create(AppContextModule module) {
    return new AppContextModule_GetApplicationContextFactory(module);
  }

  public static Context getApplicationContext(AppContextModule instance) {
    return Preconditions.checkNotNull(instance.getApplicationContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
