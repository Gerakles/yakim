package service;

import Interfaces.Resourse;
import body.Page;
import body.Photo;

import java.util.ArrayList;
import java.util.List;

public class ResourseList {
    public static List<Resourse> resours;

    static {
        resours = new ArrayList <>(  );
        resours.add( new Page( "main", "Вы попали на страницу Место Перемен" ) );
        resours.add( new Page( "secondPage", "Новости" ) );
        resours.add( new Photo( "frontal", 1234 ) );
    }

    public static List<Resourse> findAdminPage() {
        List<Resourse> findNew = new ArrayList <>(  );
        for (int i = 0; i <resours.size() ; i++) {
            if (resours.get( i ).getTitle().contains( "admin" ))
                findNew.add( resours.get( i ) );
        }
        return findNew;
    }

    public static List<Resourse> findUserResourse() {
        List<Resourse> findNew = new ArrayList <>(  );
        for (int i = 0; i <resours.size() ; i++) {
            if (resours.get( i ).getTitle().contains( "user" ))
                findNew.add( resours.get( i ) );
        }
        return findNew;
    }
    public static Resourse findByTitle(String title) {
        for (int i = 0; i <resours.size() ; i++) {
            if (resours.get( i ).getTitle().equals( title ))
                return resours.get( i );
        }
        return null;
    }

}
