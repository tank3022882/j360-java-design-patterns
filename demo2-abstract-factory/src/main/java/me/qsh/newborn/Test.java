package me.qsh.newborn;

import me.qsh.newborn.factory.MailSenderFactory;
import me.qsh.newborn.factory.SenderFactory;
import me.qsh.newborn.factory.SmsSenderFactory;
import me.qsh.newborn.sender.Sender;

/**
 * 测试
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public class Test {

    public static void main(String[] args) {
        SenderFactory factory = new MailSenderFactory();
//        SenderFactory factory = new SmsSenderFactory();

        Sender sender = factory.productSender();
        sender.send("123");
    }

}
