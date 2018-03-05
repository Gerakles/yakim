package model;

import api.Authorization;
import api.Resource;

import java.util.List;

public class Role implements Authorization{
    String name;
    int id;
    List<Resource> resources;

    public Role(String name, int id, List <Resource> resources) {
        this.name = name;
        this.id = id;
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List <Resource> getResources() {
        return resources;
    }

    public void setResources(List <Resource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean hasAccess(Resource resource) {
        return resources.contains( resource );
    }
}
