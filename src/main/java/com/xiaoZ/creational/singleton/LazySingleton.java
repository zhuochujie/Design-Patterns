package com.xiaoZ.creational.singleton;

/**
 * 线程不安全
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
