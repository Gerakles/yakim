package model;

public class User {
    private int id;
    private String login;
    private String password;
    private int roleid;

    public User(int id, String login, String password, int roleid) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.roleid = roleid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "USER["+id+", " + login + ", " + password + ", " +roleid+"]";
    }

}