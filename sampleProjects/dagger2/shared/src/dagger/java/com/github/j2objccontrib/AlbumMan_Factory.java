package com.github.j2objccontrib;

import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AlbumMan_Factory implements Factory<AlbumMan> {
  private final MembersInjector<AlbumMan> membersInjector;

  public AlbumMan_Factory(MembersInjector<AlbumMan> membersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
  }

  @Override
  public AlbumMan get() {  
    AlbumMan instance = new AlbumMan();
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<AlbumMan> create(MembersInjector<AlbumMan> membersInjector) {  
    return new AlbumMan_Factory(membersInjector);
  }
}

