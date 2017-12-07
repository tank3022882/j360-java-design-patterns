package me.qsh.newborn.sender;

/**
 * 实现 - 短信发送器
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public class SmsSender implements Sender {

    public void send(String message) {
        System.out.println("短信发送: "+message);
    }

}
