package me.qsh.newborn.classadapter;

/**
 * Adapter角色 - 类适配器
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class ClassAdapter extends Adaptee implements Target {

    public int getVolt5() {
        return 5;
    }

}
