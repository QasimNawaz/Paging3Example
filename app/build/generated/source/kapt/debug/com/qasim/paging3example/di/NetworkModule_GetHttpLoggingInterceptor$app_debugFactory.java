package com.qasim.paging3example.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_GetHttpLoggingInterceptor$app_debugFactory implements Factory<HttpLoggingInterceptor> {
  private final NetworkModule module;

  public NetworkModule_GetHttpLoggingInterceptor$app_debugFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return getHttpLoggingInterceptor$app_debug(module);
  }

  public static NetworkModule_GetHttpLoggingInterceptor$app_debugFactory create(
      NetworkModule module) {
    return new NetworkModule_GetHttpLoggingInterceptor$app_debugFactory(module);
  }

  public static HttpLoggingInterceptor getHttpLoggingInterceptor$app_debug(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.getHttpLoggingInterceptor$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
