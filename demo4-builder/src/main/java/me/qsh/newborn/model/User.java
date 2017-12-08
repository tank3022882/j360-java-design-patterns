package me.qsh.newborn.model;

/**
 * 用户
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public abstract class User {

    public User() {
    }

    protected String username;
    protected String password;
    protected String nickname;

    public abstract void setUsername(String username);

    public abstract void setPassword(String password);

    public abstract void setNickname(String nickname);

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", nickname=" + nickname + "]";
    }

}
