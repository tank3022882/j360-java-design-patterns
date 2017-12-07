package me.qsh.newborn.factory;

import me.qsh.newborn.sender.Sender;
import me.qsh.newborn.sender.SmsSender;

/**
 * 实现 - 短信发送器工厂
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public class SmsSenderFactory implements SenderFactory {

    public Sender productSender() {
        return new SmsSender();
    }
}
