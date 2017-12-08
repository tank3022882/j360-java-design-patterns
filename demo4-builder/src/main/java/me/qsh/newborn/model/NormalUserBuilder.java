package me.qsh.newborn.model;

/**
 * Created by fallenpanda on 15/12/25.
 */
public class NormalUserBuilder extends Builder {

    private User normalUser = new NormalUser();

    @Override
    public void buildUsername(String username) {
        normalUser.setUsername(username);
    }

    @Override
    public void buildPassword(String password) {
        normalUser.setPassword(password);
    }

    @Override
    public void buildNickname(String nickname) {
        normalUser.setNickname(nickname);
    }

    public User create() {
        return normalUser;
    }

}
