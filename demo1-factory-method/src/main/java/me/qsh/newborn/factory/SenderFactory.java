package me.qsh.newborn.factory;

import me.qsh.newborn.sender.MailSender;
import me.qsh.newborn.sender.Sender;
import me.qsh.newborn.sender.SmsSender;

/**
 * 方法工厂
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public class SenderFactory {

    /**
     * 工厂方法
     *
     * @param senderType
     * @return
     * @throws Exception
     */
    public static Sender productSender(String senderType) throws Exception {
        if ("mail".equals(senderType)) {
            return new MailSender();
        } else if ("sms".equals(senderType)) {
            return new SmsSender();
        } else {
            throw new Exception();
        }
    }

    ////////////////////////////////////////////////////////////////////////

    /**
     * 工厂方法
     *
     * @return
     */
    public static Sender productMailSender() {
        return new MailSender();
    }

    /**
     * 工厂方法
     *
     * @return
     */
    public static Sender productSmsSender() {
        return new SmsSender();
    }

}
