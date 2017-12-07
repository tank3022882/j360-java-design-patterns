package me.qsh.newborn;

/**
 * 单例 - 静态内部类实现单例
 *
 * 优化方式，线程安全
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-07 。
 * ============================================================================
 */
public class InternalClassSingleton {

    /**
     * 私有构造方法，防止被实例化
     */
    private InternalClassSingleton() {
    }

    /**
     * 此处使用一个内部类来维护单例
     */
    private static class SingletonFactory {
        private static InternalClassSingleton instance = new InternalClassSingleton();
    }

    /**
     * 获取实例
     */
    public static InternalClassSingleton getInstance() {
        return SingletonFactory.instance;
    }

    /**
     * 该方法在反序列化时会被调用，如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return getInstance();
    }

}
