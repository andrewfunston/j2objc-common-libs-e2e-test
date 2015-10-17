package com.github.j2objccontrib;

import com.github.j2objccontrib.network.SimpleRest;
import com.github.j2objccontrib.network.UrlProvider;
import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.internal.ScopedProvider;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerSharedDaggerComponent implements SharedDaggerComponent {
  private Provider<SimpleRest> providesSimpleRestProvider;
  private Provider<UrlProvider> provideUrlProvider;
  private Provider<ExecutorService> provideExecutorProvider;
  private Provider<Gson> provideGsonProvider;
  private MembersInjector<AlbumMan> albumManMembersInjector;
  private Provider<AlbumMan> albumManProvider;

  private DaggerSharedDaggerComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.providesSimpleRestProvider = ScopedProvider.create(SharedDaggerModule_ProvidesSimpleRestFactory.create(builder.sharedDaggerModule));
    this.provideUrlProvider = ScopedProvider.create(SharedDaggerModule_ProvideUrlProviderFactory.create(builder.sharedDaggerModule));
    this.provideExecutorProvider = ScopedProvider.create(SharedDaggerModule_ProvideExecutorFactory.create(builder.sharedDaggerModule));
    this.provideGsonProvider = ScopedProvider.create(SharedDaggerModule_ProvideGsonFactory.create(builder.sharedDaggerModule));
    this.albumManMembersInjector = AlbumMan_MembersInjector.create(providesSimpleRestProvider, provideUrlProvider, provideExecutorProvider, provideGsonProvider);
    this.albumManProvider = AlbumMan_Factory.create(albumManMembersInjector);
  }

  @Override
  public AlbumMan getAlbumMan() {  
    return albumManProvider.get();
  }

  public static final class Builder {
    private SharedDaggerModule sharedDaggerModule;
  
    private Builder() {  
    }
  
    public SharedDaggerComponent build() {  
      if (sharedDaggerModule == null) {
        throw new IllegalStateException("sharedDaggerModule must be set");
      }
      return new DaggerSharedDaggerComponent(this);
    }
  
    public Builder sharedDaggerModule(SharedDaggerModule sharedDaggerModule) {  
      if (sharedDaggerModule == null) {
        throw new NullPointerException("sharedDaggerModule");
      }
      this.sharedDaggerModule = sharedDaggerModule;
      return this;
    }
  }
}

