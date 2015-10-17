package com.github.j2objccontrib.models;

public class Albums {

    public final Album[] albums = new Album[0];

    public static final class Album {
        public final int userId;
        public final int id;
        public final String title;

        public Album(int userId, int id, String title) {
            this.userId = userId;
            this.id = id;
            this.title = title;
        }

        public Album() {
            this.userId = -1;
            this.id = -1;
            this.title = null;
        }
    }
}
