package com.github.j2objccontrib;

import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SharedDaggerModule_ProvideExecutorFactory implements Factory<ExecutorService> {
  private final SharedDaggerModule module;

  public SharedDaggerModule_ProvideExecutorFactory(SharedDaggerModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public ExecutorService get() {  
    ExecutorService provided = module.provideExecutor();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ExecutorService> create(SharedDaggerModule module) {  
    return new SharedDaggerModule_ProvideExecutorFactory(module);
  }
}

