package me.qsh.newborn.factory;

import me.qsh.newborn.sender.MailSender;
import me.qsh.newborn.sender.Sender;

/**
 * 实现 - 邮件发送器工厂
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public class MailSenderFactory implements SenderFactory {

    public Sender productSender() {
        return new MailSender();
    }
}
