package com.github.j2objccontrib;

import com.github.j2objccontrib.network.SimpleRest;
import com.github.j2objccontrib.network.UrlProvider;
import com.google.gson.Gson;
import dagger.MembersInjector;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AlbumMan_MembersInjector implements MembersInjector<AlbumMan> {
  private final Provider<SimpleRest> mSimpleRestProvider;
  private final Provider<UrlProvider> mUrlProvider;
  private final Provider<ExecutorService> mExecutorProvider;
  private final Provider<Gson> mGsonProvider;

  public AlbumMan_MembersInjector(Provider<SimpleRest> mSimpleRestProvider, Provider<UrlProvider> mUrlProvider, Provider<ExecutorService> mExecutorProvider, Provider<Gson> mGsonProvider) {  
    assert mSimpleRestProvider != null;
    this.mSimpleRestProvider = mSimpleRestProvider;
    assert mUrlProvider != null;
    this.mUrlProvider = mUrlProvider;
    assert mExecutorProvider != null;
    this.mExecutorProvider = mExecutorProvider;
    assert mGsonProvider != null;
    this.mGsonProvider = mGsonProvider;
  }

  @Override
  public void injectMembers(AlbumMan instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mSimpleRest = mSimpleRestProvider.get();
    instance.mUrlProvider = mUrlProvider.get();
    instance.mExecutor = mExecutorProvider.get();
    instance.mGson = mGsonProvider.get();
  }

  public static MembersInjector<AlbumMan> create(Provider<SimpleRest> mSimpleRestProvider, Provider<UrlProvider> mUrlProvider, Provider<ExecutorService> mExecutorProvider, Provider<Gson> mGsonProvider) {  
      return new AlbumMan_MembersInjector(mSimpleRestProvider, mUrlProvider, mExecutorProvider, mGsonProvider);
  }
}

