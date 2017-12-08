package me.qsh.newborn;

import me.qsh.newborn.model2.NormalUser;
import me.qsh.newborn.model2.User;

/**
 * 测试 - 改进实现
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class Test {

    public static void main(String[] args) {
        User user = new NormalUser.Builder()
                .setUsername("username")
                .setPassword("password")
                .setNickname("普通用户")
                .build();

        User user2 = NormalUser.newBuilder()
                .setUsername("username")
                .setPassword("password")
                .setNickname("普通用户")
                .build();

        System.out.println("User Info : " + user);
    }

}
