package com.qasim.paging3example.di;

import com.google.gson.Gson;
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
public final class GsonModule_ProvideGsonFactory implements Factory<Gson> {
  private final GsonModule module;

  public GsonModule_ProvideGsonFactory(GsonModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson(module);
  }

  public static GsonModule_ProvideGsonFactory create(GsonModule module) {
    return new GsonModule_ProvideGsonFactory(module);
  }

  public static Gson provideGson(GsonModule instance) {
    return Preconditions.checkNotNull(instance.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
