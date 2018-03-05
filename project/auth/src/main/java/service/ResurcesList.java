package service;

import api.Resource;
import model.Page;
import model.Photo;

import java.util.ArrayList;
import java.util.List;

public class ResurcesList {
    public static List <Resource> resours;

    static {
        resours = new ArrayList <>();
        resours.add( new Page( "first", "body" ) );
        resours.add( new Photo( "second", 999 ) );
        resours.add( new Page( "admin-Page", "body" ) );
    }

    public static List <Resource> findAdminPage() {
        List <Resource> findNew = new ArrayList <>();
        for (int i = 0; i < resours.size(); i++) {
            if (resours.get( i ).getTitle().contains( "admin" ))
                findNew.add( resours.get( i ) );

        }
        return findNew;
    }

    public static List <Resource> findUserResourse() {
        List <Resource> findNew = new ArrayList <>();
        for (int i = 0; i < resours.size(); i++) {
            if (!resours.get( i ).getTitle().contains( "user" ))
                findNew.add( resours.get( i ) );

        }
        return findNew;
    }

    public static Resource findByTitle(String title) {
        for (int i = 0; i < resours.size(); i++) {
            if (resours.get( i ).getTitle().equals( title ))
                return resours.get( i );

        }
        return null;
    }
}
