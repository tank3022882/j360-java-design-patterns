package me.qsh.newborn.factory;

import me.qsh.newborn.product.Product;
import me.qsh.newborn.product.ProductA;

/**
 * 工厂 - A
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class FactoryA extends Factory {

    public Product createProducer() {
        return new ProductA();
    }

}
