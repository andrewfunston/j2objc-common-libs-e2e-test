package com.github.j2objccontrib.core_impl;

import com.github.j2objccontrib.network.SimpleRest;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class SimpleNetImpl implements SimpleRest {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    final OkHttpClient mOkHttpClient;

    public SimpleNetImpl() {
        mOkHttpClient = new OkHttpClient();
    }

    @Override
    public String get(String url) {
        try {
            final Request build = new Request.Builder().get().url(url).build();
            final Response netResponse = mOkHttpClient.newCall(build).execute();
            if (netResponse.isSuccessful()) {
                return netResponse.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String post(String url, String jsonToPost) {
        try {
            final Request build = new Request
                    .Builder()
                    .url(url)
                    .post(RequestBody.create(JSON, jsonToPost))
                    .build();

            final Response netResponse = mOkHttpClient.newCall(build).execute();
            if (netResponse.isSuccessful()) {
                return netResponse.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String put(String url, String jsonToPost) {
        try {
            final Request build = new Request
                    .Builder()
                    .url(url)
                    .put(RequestBody.create(JSON, jsonToPost))
                    .build();

            final Response netResponse = mOkHttpClient.newCall(build).execute();
            if (netResponse.isSuccessful()) {
                return netResponse.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean delete(String url) {
        try {
            final Request build = new Request
                    .Builder()
                    .url(url)
                    .delete()
                    .build();

            final Response netResponse = mOkHttpClient.newCall(build).execute();
            return netResponse.isSuccessful();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
