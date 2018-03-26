package body;

public class User {
    private int id;
    private String login;
    private String password;
    private int roleId;

    public User(int id, String login, String password, int roleId) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.roleId = roleId;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "USER[" + id + ", " + login + ", " + password + ", " + roleId + "]";
    }
}
