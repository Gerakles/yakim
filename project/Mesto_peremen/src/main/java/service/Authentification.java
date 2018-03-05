package service;

import body.User;

public class Authentification {
    public User carentUser;

    public boolean login(String login, String password) {
        for (User user : UserList.service.findAll()) {
            if (login.equals( user.getLogin() ) && password.equals( user.getPassword() )) {
                carentUser = user;
                return true;
            }
        }
        return false;
    }

    public User getCarentUser() {
        return carentUser;
    }

    public void setCarentUser(User carentUser) {
        this.carentUser = carentUser;
    }
}
