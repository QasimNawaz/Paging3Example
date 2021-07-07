package com.qasim.paging3example.di;

import com.qasim.paging3example.data.WebService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_GetApiInterface$app_debugFactory implements Factory<WebService> {
  private final NetworkModule module;

  private final Provider<Retrofit> retroFitProvider;

  public NetworkModule_GetApiInterface$app_debugFactory(NetworkModule module,
      Provider<Retrofit> retroFitProvider) {
    this.module = module;
    this.retroFitProvider = retroFitProvider;
  }

  @Override
  public WebService get() {
    return getApiInterface$app_debug(module, retroFitProvider.get());
  }

  public static NetworkModule_GetApiInterface$app_debugFactory create(NetworkModule module,
      Provider<Retrofit> retroFitProvider) {
    return new NetworkModule_GetApiInterface$app_debugFactory(module, retroFitProvider);
  }

  public static WebService getApiInterface$app_debug(NetworkModule instance, Retrofit retroFit) {
    return Preconditions.checkNotNull(instance.getApiInterface$app_debug(retroFit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
