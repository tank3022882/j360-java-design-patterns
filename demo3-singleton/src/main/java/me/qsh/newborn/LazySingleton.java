package me.qsh.newborn;

/**
 * 单例 - 懒汉式
 *
 * 非线程安全
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-07 。
 * ============================================================================
 */
public class LazySingleton {

    /**
     * 私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static LazySingleton instance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private LazySingleton() {
    }

    /**
     *  静态工程方法，创建实例
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 该方法在反序列化时会被调用，如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return instance;
    }

}
