package body;

import Interfaces.Resourse;

public class Photo implements Resourse {
    String title;
    int size;

    public Photo(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
