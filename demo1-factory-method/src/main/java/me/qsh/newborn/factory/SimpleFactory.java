package me.qsh.newborn.factory;

import me.qsh.newborn.product.Product;
import me.qsh.newborn.product.ProductA;

/**
 * 简单工厂
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class SimpleFactory {

    public static Product createProducer(String type) throws Exception {
        if ("A".equals(type)) {
            return new ProductA();
        } else if ("A".equals(type)) {
            return new ProductA();
        } else {
            throw new Exception();
        }
    }

}
