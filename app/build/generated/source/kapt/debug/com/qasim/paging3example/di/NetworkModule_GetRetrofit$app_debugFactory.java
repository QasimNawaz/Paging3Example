package com.qasim.paging3example.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_GetRetrofit$app_debugFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_GetRetrofit$app_debugFactory(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return getRetrofit$app_debug(module, okHttpClientProvider.get());
  }

  public static NetworkModule_GetRetrofit$app_debugFactory create(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_GetRetrofit$app_debugFactory(module, okHttpClientProvider);
  }

  public static Retrofit getRetrofit$app_debug(NetworkModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.getRetrofit$app_debug(okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
