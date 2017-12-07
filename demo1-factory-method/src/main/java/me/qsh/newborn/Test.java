package me.qsh.newborn;

import me.qsh.newborn.factory.SenderFactory;
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
        try {
            // 工厂方法
//            Sender sender = SenderFactory.productSender("mail");
            Sender sender = SenderFactory.productSender("sms");

            // 改进形式的工厂方法
//            Sender sender = SenderFactory.productMailSender();
//            Sender sender = SenderFactory.productSmsSender();

            sender.send("123");
        } catch (Exception e) {
            System.out.println("错误的 senderType");
        }
    }

}
