package com.github.j2objccontrib;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        SharedDaggerModule.class
})
public interface SharedDaggerComponent {

    AlbumMan getAlbumMan();

}
