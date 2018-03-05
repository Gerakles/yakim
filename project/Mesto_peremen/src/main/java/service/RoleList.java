package service;

import body.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleList {
    public static List <Role> roles;

    static {
        roles = new ArrayList <>();
        roles.add( new Role( "administrator", 1, ResourseList.resours ) );
        roles.add( new Role( "user", 2, ResourseList.findUserResourse() ) );
    }

    public static Role findByName(String name) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get( i ).getName().equals( name ))
                return roles.get( i );
        }
        return null;
    }

    public static Role findByID(int id) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get( i ).getID() == id)
                return roles.get( i );
        }
        return null;
    }
}
