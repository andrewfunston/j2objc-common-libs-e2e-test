package com.github.j2objccontrib;

import com.github.j2objccontrib.models.Albums;
import com.github.j2objccontrib.network.SimpleRest;
import com.github.j2objccontrib.network.UrlProvider;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonWriter;

import java.io.StringWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import javax.inject.Inject;

public class AlbumMan {

    @Inject SimpleRest mSimpleRest;
    //    @Inject SimpleStore mSimpleDisk;
    @Inject UrlProvider mUrlProvider;
    @Inject ExecutorService mExecutor;
    @Inject Gson mGson;

    @Inject
    public AlbumMan() { }

    public Future<Albums> fetchAlbums() {
        return mExecutor.submit(new Callable<Albums>() {
            @Override
            public Albums call() throws Exception {
                try {
                    final String json = mSimpleRest.get(mUrlProvider.getAllAlbumsUrl());
                    if (json != null) {
                        return mGson.fromJson(json, Albums.class);
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
                return new Albums();
            }
        });
    }

    public Future<Albums.Album> getAlbum(final int postId) {
        return mExecutor.submit(new Callable<Albums.Album>() {
            @Override
            public Albums.Album call() throws Exception {
                try {
                    final String json = mSimpleRest.get(mUrlProvider.getSingleAlbumUrl(postId));
                    if (json != null) {
                        return mGson.fromJson(json, Albums.Album.class);
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
                return new Albums.Album();
            }
        });
    }

    public Future<Albums.Album> createAlbum(final int userId, final String title) {
        return mExecutor.submit(new Callable<Albums.Album>() {
            @Override
            public Albums.Album call() throws Exception {
                try {
                    final StringWriter stringWriter = new StringWriter();
                    new JsonWriter(stringWriter)
                            .beginObject()
                            .name("title")
                            .value(title)
                            .name("userId")
                            .value(userId)
                            .endObject()
                            .close();
                    final String createJsonString = stringWriter.toString();

                    final String json = mSimpleRest.post(mUrlProvider.getPostUrl(), createJsonString);
                    if (json != null) {
                        // Endpoint returns just the id, we let gson parse it for us, lazy :)
                        final Albums.Album album = mGson.fromJson(json, Albums.Album.class);

                        return new Albums.Album(userId, album.id, title);
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
                return new Albums.Album();
            }
        });
    }

    public Future<Albums.Album> updateAlbum(final int userId, final String newTitle) {
        return mExecutor.submit(new Callable<Albums.Album>() {
            @Override
            public Albums.Album call() throws Exception {
                try {
                    final StringWriter stringWriter = new StringWriter();
                    new JsonWriter(stringWriter)
                            .beginObject()
                            .name("title")
                            .value(newTitle)
                            .endObject()
                            .close();
                    final String updateJsonString = stringWriter.toString();

                    final String json = mSimpleRest.post(mUrlProvider.getPutUrl(userId), updateJsonString);
                    if (json != null) {
                        final Albums.Album parsedAlbum = mGson.fromJson(json, Albums.Album.class);

                        // The demo endpoint we're using doesn't actually change titles, we'll pretend that we did.
                        return new Albums.Album(parsedAlbum.userId, parsedAlbum.id, newTitle);
                    }
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
                return new Albums.Album();
            }
        });
    }

    public Future<Boolean> deleteAlbum(final int postId) {
        return mExecutor.submit(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                return mSimpleRest.delete(mUrlProvider.getDeleteUrl(postId));
            }
        });
    }
}
