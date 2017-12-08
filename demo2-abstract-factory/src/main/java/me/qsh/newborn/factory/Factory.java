package me.qsh.newborn.factory;

import me.qsh.newborn.product.ProductA;
import me.qsh.newborn.product.ProductB;

/**
 * 工厂
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public abstract class Factory {

    //创建A产品家族
    public abstract ProductA createProductA();
    //创建B产品家族
    public abstract ProductB createProductB();

    //如果有N个产品系列，这里就应该有N个创建方法

}
