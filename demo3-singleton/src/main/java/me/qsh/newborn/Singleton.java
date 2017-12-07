package me.qsh.newborn;

/**
 * 单例 - 饿汉式
 *
 * 线程安全，但是常驻内存，降低了资源利用率
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-07 。
 * ============================================================================
 */
public class Singleton {

    /**
     * 私有静态实例，防止被引用
     */
    private static Singleton instance = new Singleton();

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton() {
    }

    /**
     * 静态工程方法，获得实例
     */
    public static Singleton getInstance() {
        return instance;
    }

    /**
     * 该方法在反序列化时会被调用，如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return instance;
    }

}
