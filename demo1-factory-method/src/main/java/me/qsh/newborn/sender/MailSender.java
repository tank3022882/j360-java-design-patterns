package me.qsh.newborn.sender;

/**
 * 实现 - 邮件发送器
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public class MailSender implements Sender {

    public void send(String message) {
        System.out.println("邮件: "+message);
    }

}
