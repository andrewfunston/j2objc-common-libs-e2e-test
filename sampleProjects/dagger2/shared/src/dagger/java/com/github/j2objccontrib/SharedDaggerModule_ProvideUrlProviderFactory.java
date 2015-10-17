package com.github.j2objccontrib;

import com.github.j2objccontrib.network.UrlProvider;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SharedDaggerModule_ProvideUrlProviderFactory implements Factory<UrlProvider> {
  private final SharedDaggerModule module;

  public SharedDaggerModule_ProvideUrlProviderFactory(SharedDaggerModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public UrlProvider get() {  
    UrlProvider provided = module.provideUrlProvider();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UrlProvider> create(SharedDaggerModule module) {  
    return new SharedDaggerModule_ProvideUrlProviderFactory(module);
  }
}

