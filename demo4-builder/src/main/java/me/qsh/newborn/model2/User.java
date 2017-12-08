package me.qsh.newborn.model2;

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

    protected User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

    private final String username;
    private final String password;
    private final String nickname;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", nickname=" + nickname + "]";
    }

    protected abstract static class Builder<T extends User, B extends Builder<T, B>> {

        private B theBuilder;

        protected String username;
        protected String password;
        protected String nickname;

        public Builder () {
            theBuilder = getThis();
        }

        protected abstract B getThis();

        public B setUsername(String username) {
            this.username = username;
            return theBuilder;
        }

        public B setPassword(String password) {
            this.password = password;
            return theBuilder;
        }

        public B setNickname(String nickname) {
            this.nickname = nickname;
            return theBuilder;
        }

        public abstract T build();

    }

}
