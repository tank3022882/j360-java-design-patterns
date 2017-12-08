package me.qsh.newborn;

import me.qsh.newborn.factory.Factory;
import me.qsh.newborn.factory.Factory1;
import me.qsh.newborn.product.ProductA;
import me.qsh.newborn.product.ProductB;

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
        Factory factory = new Factory1();
//        Factory factory = new Factory2();

        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.doSomething();
        productB.doSomething();
    }

}
