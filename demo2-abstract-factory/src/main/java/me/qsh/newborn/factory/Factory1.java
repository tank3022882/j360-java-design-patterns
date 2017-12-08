package me.qsh.newborn.factory;

import me.qsh.newborn.product.ProductA;
import me.qsh.newborn.product.ProductA1;
import me.qsh.newborn.product.ProductB;
import me.qsh.newborn.product.ProductB1;

/**
 * 工厂 - 系列1
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class Factory1 extends Factory {


    public ProductA createProductA() {
        return new ProductA1();
    }

    public ProductB createProductB() {
        return new ProductB1();
    }

}
