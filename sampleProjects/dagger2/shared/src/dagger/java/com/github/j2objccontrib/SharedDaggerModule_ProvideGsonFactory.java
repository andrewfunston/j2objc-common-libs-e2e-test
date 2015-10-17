package com.github.j2objccontrib;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SharedDaggerModule_ProvideGsonFactory implements Factory<Gson> {
  private final SharedDaggerModule module;

  public SharedDaggerModule_ProvideGsonFactory(SharedDaggerModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {  
    Gson provided = module.provideGson();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Gson> create(SharedDaggerModule module) {  
    return new SharedDaggerModule_ProvideGsonFactory(module);
  }
}

