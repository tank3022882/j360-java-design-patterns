package me.qsh.newborn.model;

/**
 * 构建器
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public abstract class Builder {

    public abstract void buildUsername(String username);

    public abstract void buildPassword(String password);

    public abstract void buildNickname(String nickname);

    public abstract User create();

}
