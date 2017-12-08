package me.qsh.newborn.model;

/**
 * 测试 - 经典实现
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class Test {

    public static void main(String[] args) {
        // 构建器
        Builder builder = new NormalUserBuilder();
        // Director
        Director normalDirector = new Director(builder);
        // 封装构建过程
        normalDirector.construct("username", "password", "普通用户");
        // 构建用户
        User user = builder.create();
        System.out.println("User Info : " + user);
    }

}
