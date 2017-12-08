package me.qsh.newborn;

import me.qsh.newborn.factory.Factory;
import me.qsh.newborn.factory.FactoryA;
import me.qsh.newborn.factory.SimpleFactory;
import me.qsh.newborn.product.Product;

/**
 * 客户端
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-06 。
 * ============================================================================
 */
public class Client {

    public static void main(String[] args) {
        try {
            // 简单工厂
            Product product = SimpleFactory.createProducer("A");
//        AbstractProduct product = SimpleFactory.createProducer("B");
            product.use();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 工厂方法
        Factory factory = new FactoryA();
//        Factory factory = new FactoryB();
        Product product = factory.createProducer();
        product.use();

    }

}
