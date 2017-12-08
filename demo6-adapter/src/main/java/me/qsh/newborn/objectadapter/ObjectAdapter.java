package me.qsh.newborn.objectadapter;

import me.qsh.newborn.classadapter.Adaptee;
import me.qsh.newborn.classadapter.Target;

/**
 * Adapter角色 - 对象适配器
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public int getVolt220() {
        return adaptee.getVolt220();
    }

    public int getVolt5() {
        return 5;
    }

}
