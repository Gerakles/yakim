package service;

import model.User;

public class Authentication {
    public User carentuser;

    public boolean login(String login, String password) {
        for (User user : UserList.service.findAll()) {
            if (login.equals( user.getLogin() ) && password.equals( user.getPassword() )) {
                carentuser = user;
                return true;
            }
        }
        return false;
    }

    public User getcarentuser() {
        return carentuser;
    }

    public void setCarentuser(User carentuser) {
        this.carentuser = carentuser;
    }
}
