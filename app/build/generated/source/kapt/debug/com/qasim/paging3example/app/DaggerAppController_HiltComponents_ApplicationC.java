package com.qasim.paging3example.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.common.database.PixabayDatabase;
import com.qasim.paging3example.data.WebService;
import com.qasim.paging3example.data.repo.PixabayRepo;
import com.qasim.paging3example.di.AppContextModule;
import com.qasim.paging3example.di.DatabaseModule;
import com.qasim.paging3example.di.DatabaseModule_ProvideAppDatabaseFactory;
import com.qasim.paging3example.di.GsonModule;
import com.qasim.paging3example.di.NetworkModule;
import com.qasim.paging3example.di.NetworkModule_GetApiInterface$app_debugFactory;
import com.qasim.paging3example.di.NetworkModule_GetHttpLoggingInterceptor$app_debugFactory;
import com.qasim.paging3example.di.NetworkModule_GetOkHttpClient$app_debugFactory;
import com.qasim.paging3example.di.NetworkModule_GetRetrofit$app_debugFactory;
import com.qasim.paging3example.ui.DataActivity;
import com.qasim.paging3example.ui.paging.PagingFragment;
import com.qasim.paging3example.ui.paging.PagingViewModel_AssistedFactory;
import com.qasim.paging3example.ui.paging.PagingViewModel_AssistedFactory_Factory;
import com.qasim.paging3example.ui.pagingwithroom.PagingWithRoomFragment;
import com.qasim.paging3example.ui.pagingwithroom.PagingWithRoomViewModel_AssistedFactory;
import com.qasim.paging3example.ui.pagingwithroom.PagingWithRoomViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerAppController_HiltComponents_ApplicationC extends AppController_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final NetworkModule networkModule;

  private final DatabaseModule databaseModule;

  private volatile Object pixabayDatabase = new MemoizedSentinel();

  private volatile Object pixabayRepo = new MemoizedSentinel();

  private volatile Provider<PixabayRepo> pixabayRepoProvider;

  private DaggerAppController_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam, DatabaseModule databaseModuleParam,
      NetworkModule networkModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.networkModule = networkModuleParam;
    this.databaseModule = databaseModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    return NetworkModule_GetOkHttpClient$app_debugFactory.getOkHttpClient$app_debug(networkModule, NetworkModule_GetHttpLoggingInterceptor$app_debugFactory.getHttpLoggingInterceptor$app_debug(networkModule));
  }

  private Retrofit getRetrofit() {
    return NetworkModule_GetRetrofit$app_debugFactory.getRetrofit$app_debug(networkModule, getOkHttpClient());
  }

  private WebService getWebService() {
    return NetworkModule_GetApiInterface$app_debugFactory.getApiInterface$app_debug(networkModule, getRetrofit());
  }

  private PixabayDatabase getPixabayDatabase() {
    Object local = pixabayDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = pixabayDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideAppDatabaseFactory.provideAppDatabase(databaseModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          pixabayDatabase = DoubleCheck.reentrantCheck(pixabayDatabase, local);
        }
      }
    }
    return (PixabayDatabase) local;
  }

  private PixabayRepo getPixabayRepo() {
    Object local = pixabayRepo;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = pixabayRepo;
        if (local instanceof MemoizedSentinel) {
          local = new PixabayRepo(getWebService(), getPixabayDatabase());
          pixabayRepo = DoubleCheck.reentrantCheck(pixabayRepo, local);
        }
      }
    }
    return (PixabayRepo) local;
  }

  private Provider<PixabayRepo> getPixabayRepoProvider() {
    Object local = pixabayRepoProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      pixabayRepoProvider = (Provider<PixabayRepo>) local;
    }
    return (Provider<PixabayRepo>) local;
  }

  @Override
  public void injectAppController(AppController appController) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DatabaseModule databaseModule;

    private NetworkModule networkModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appContextModule(AppContextModule appContextModule) {
      Preconditions.checkNotNull(appContextModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder gsonModule(GsonModule gsonModule) {
      Preconditions.checkNotNull(gsonModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public AppController_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerAppController_HiltComponents_ApplicationC(applicationContextModule, databaseModule, networkModule);
    }
  }

  private final class ActivityRetainedCBuilder implements AppController_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public AppController_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends AppController_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements AppController_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public AppController_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends AppController_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<PagingViewModel_AssistedFactory> pagingViewModel_AssistedFactoryProvider;

      private volatile Provider<PagingWithRoomViewModel_AssistedFactory> pagingWithRoomViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private PagingViewModel_AssistedFactory getPagingViewModel_AssistedFactory() {
        return PagingViewModel_AssistedFactory_Factory.newInstance(DaggerAppController_HiltComponents_ApplicationC.this.getPixabayRepoProvider());
      }

      private Provider<PagingViewModel_AssistedFactory> getPagingViewModel_AssistedFactoryProvider(
          ) {
        Object local = pagingViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          pagingViewModel_AssistedFactoryProvider = (Provider<PagingViewModel_AssistedFactory>) local;
        }
        return (Provider<PagingViewModel_AssistedFactory>) local;
      }

      private PagingWithRoomViewModel_AssistedFactory getPagingWithRoomViewModel_AssistedFactory() {
        return PagingWithRoomViewModel_AssistedFactory_Factory.newInstance(DaggerAppController_HiltComponents_ApplicationC.this.getPixabayRepoProvider());
      }

      private Provider<PagingWithRoomViewModel_AssistedFactory> getPagingWithRoomViewModel_AssistedFactoryProvider(
          ) {
        Object local = pagingWithRoomViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          pagingWithRoomViewModel_AssistedFactoryProvider = (Provider<PagingWithRoomViewModel_AssistedFactory>) local;
        }
        return (Provider<PagingWithRoomViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.qasim.paging3example.ui.paging.PagingViewModel", (Provider) getPagingViewModel_AssistedFactoryProvider()).put("com.qasim.paging3example.ui.pagingwithroom.PagingWithRoomViewModel", (Provider) getPagingWithRoomViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerAppController_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectDataActivity(DataActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements AppController_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public AppController_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends AppController_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerAppController_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectPagingFragment(PagingFragment arg0) {
        }

        @Override
        public void injectPagingWithRoomFragment(PagingWithRoomFragment arg0) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements AppController_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public AppController_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends AppController_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements AppController_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public AppController_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends AppController_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.qasim.paging3example.ui.paging.PagingViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPagingViewModel_AssistedFactory();

            case 1: // com.qasim.paging3example.ui.pagingwithroom.PagingWithRoomViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPagingWithRoomViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements AppController_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public AppController_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends AppController_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.qasim.paging3example.data.repo.PixabayRepo 
        return (T) DaggerAppController_HiltComponents_ApplicationC.this.getPixabayRepo();

        default: throw new AssertionError(id);
      }
    }
  }
}
