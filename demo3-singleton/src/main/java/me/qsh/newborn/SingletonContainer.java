package me.qsh.newborn;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例 - 容器
 *
 * 注册到容器，根据key获取对象
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-07 。
 * ============================================================================
 */
public class SingletonContainer {

    /**
     * 容器
     */
    private static Map<String, Singleton> objMap = new HashMap<String, Singleton>();

    /**
     * 注册对象到map中
     * @param key
     * @param instance
     */
    public static void registerService(String key, Singleton instance) {
        if (!objMap.containsKey(key) ) {
            objMap.put(key, instance) ;
        }
    }

    /**
     * 根据key获取对象
     * @param key
     * @return
     */
    public static Singleton getService(String key) {
        return objMap.get(key) ;
    }

}
