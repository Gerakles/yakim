package model;

import api.Resource;

public class Photo implements Resource {
    String title;
    int size;

    public Photo(String title, int size) {
        this.title = title;
        this.size = size;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
