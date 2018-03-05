package body;

import Interfaces.Resourse;

public class Page implements Resourse{
    String title;
    String body;

    public Page(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "PAGE["+body+"]";
    }
}
