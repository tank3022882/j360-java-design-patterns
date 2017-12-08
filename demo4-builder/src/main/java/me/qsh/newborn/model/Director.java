package me.qsh.newborn.model;

/**
 * 指导者
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public  void construct(String username, String password, String nickname) {
        mBuilder.buildUsername(username);
        mBuilder.buildPassword(password);
        mBuilder.buildNickname(nickname);
    }

}
