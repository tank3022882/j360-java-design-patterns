package me.qsh.newborn.factory;

import me.qsh.newborn.product.ProductA;
import me.qsh.newborn.product.ProductA2;
import me.qsh.newborn.product.ProductB;
import me.qsh.newborn.product.ProductB2;

/**
 * 工厂 - 系列2
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class Factory2 extends Factory {


    public ProductA createProductA() {
        return new ProductA2();
    }

    public ProductB createProductB() {
        return new ProductB2();
    }

}
