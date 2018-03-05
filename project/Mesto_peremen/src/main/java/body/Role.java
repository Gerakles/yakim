package body;

import Interfaces.Authorization;
import Interfaces.Resourse;

import java.util.List;

public class Role implements Authorization {
    String name;
    int ID;
    List <Resourse> resourses;

    public Role(String name, int ID, List <Resourse> resourses) {
        this.name = name;
        this.ID = ID;
        this.resourses = resourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List <Resourse> getResourses() {
        return resourses;
    }

    public void setResourses(List <Resourse> resourses) {
        this.resourses = resourses;
    }

    @Override
    public boolean hasAcces(Resourse resourse) {
        return resourses.contains( resourse );
    }
}