package com.github.j2objccontrib;

import com.github.j2objccontrib.network.SimpleRest;
import com.github.j2objccontrib.network.UrlProvider;
import com.google.gson.Gson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedDaggerModule {

    public final SimpleRest mSimpleRest;
    public final UrlProvider mUrlProvider;

    public SharedDaggerModule(SimpleRest simpleRest, UrlProvider provider) {
        this.mSimpleRest = simpleRest;
        this.mUrlProvider = provider;
    }

    @Provides
    @Singleton
    SimpleRest providesSimpleRest() {
        return mSimpleRest;
    }

    @Provides
    @Singleton
    UrlProvider provideUrlProvider() {
        return mUrlProvider;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    ExecutorService provideExecutor() {
        return Executors.newFixedThreadPool(3);
    }
}
