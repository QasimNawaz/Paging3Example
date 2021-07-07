package com.qasim.paging3example.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_GetOkHttpClient$app_debugFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public NetworkModule_GetOkHttpClient$app_debugFactory(NetworkModule module,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.module = module;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return getOkHttpClient$app_debug(module, httpLoggingInterceptorProvider.get());
  }

  public static NetworkModule_GetOkHttpClient$app_debugFactory create(NetworkModule module,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new NetworkModule_GetOkHttpClient$app_debugFactory(module, httpLoggingInterceptorProvider);
  }

  public static OkHttpClient getOkHttpClient$app_debug(NetworkModule instance,
      HttpLoggingInterceptor httpLoggingInterceptor) {
    return Preconditions.checkNotNull(instance.getOkHttpClient$app_debug(httpLoggingInterceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
