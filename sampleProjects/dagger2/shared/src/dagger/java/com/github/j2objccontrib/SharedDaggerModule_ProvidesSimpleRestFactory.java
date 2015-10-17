package com.github.j2objccontrib;

import com.github.j2objccontrib.network.SimpleRest;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SharedDaggerModule_ProvidesSimpleRestFactory implements Factory<SimpleRest> {
  private final SharedDaggerModule module;

  public SharedDaggerModule_ProvidesSimpleRestFactory(SharedDaggerModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public SimpleRest get() {  
    SimpleRest provided = module.providesSimpleRest();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<SimpleRest> create(SharedDaggerModule module) {  
    return new SharedDaggerModule_ProvidesSimpleRestFactory(module);
  }
}

