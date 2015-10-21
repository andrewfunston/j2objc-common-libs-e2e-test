package com.github.j2objccontrib.network;

public interface UrlProvider {

    String getAllAlbumsUrl();

    String getSingleAlbumUrl(int albumId);

    String getPostUrl();

    String getPutUrl(int albumId);

    String getDeleteUrl(int postId);

}
