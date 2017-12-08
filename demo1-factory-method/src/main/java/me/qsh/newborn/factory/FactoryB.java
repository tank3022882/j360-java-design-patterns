package me.qsh.newborn.factory;

import me.qsh.newborn.product.Product;
import me.qsh.newborn.product.ProductB;

/**
 * 工厂 - B
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class FactoryB extends Factory {

    public Product createProducer() {
        return new ProductB();
    }

}
