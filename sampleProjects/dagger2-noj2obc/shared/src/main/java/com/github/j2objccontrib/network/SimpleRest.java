package com.github.j2objccontrib.network;

public interface SimpleRest {

    /**
     * Returns a null string if something has gone awry, otherwise returns the json.
     *
     * @param url
     * @return
     */
    String get(String url);

    /**
     * Returns a null string if something has gone awry, otherwise returns the json of the created object.
     *
     * @param url
     * @param jsonToPost
     * @return
     */
    String post(String url, String jsonToPost);

    /**
     * Returns a null string if something has gone awry, otherwise returns the json of the updated object.
     *
     * @param url
     * @param jsonToPost
     * @return
     */
    String put(String url, String jsonToPost);

    /**
     * Returns true if successful, false if failed.
     *
     * @param url
     * @return
     */
    boolean delete(String url);
}
