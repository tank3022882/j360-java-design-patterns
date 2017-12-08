package me.qsh.newborn.model2;

/**
 * 普通用户
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class NormalUser extends User {

    private NormalUser(String username, String password, String nickname) {
        super(username, password, nickname);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder extends User.Builder<NormalUser, Builder> {

        protected Builder getThis() {
            return this;
        }

        public NormalUser build() {
            // 属性校验判断...（非线程安全）
            NormalUser user = new NormalUser(username, password, nickname);
            // 属性校验判断...（线程安全）

            return user;
        }

    }

}
