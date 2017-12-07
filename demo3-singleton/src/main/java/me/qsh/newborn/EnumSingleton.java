package me.qsh.newborn;

/**
 * 单例 - 枚举实现单例
 *
 * 线程安全
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-07 。
 * ============================================================================
 */
public class EnumSingleton {

    private enum SingletonEnum{

        INSTANCE;

        private EnumSingleton instance;

        private SingletonEnum(){//枚举类的构造方法在类加载是被实例化
            instance = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return instance;
        }
    }

    public static EnumSingleton getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }

    /**
     * 该方法在反序列化时会被调用，如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return getInstance();
    }


}
