package me.qsh.newborn.factory;

import me.qsh.newborn.sender.Sender;

/**
 * 接口 - 发送器工厂
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public interface SenderFactory {

    Sender productSender();

}
