package com.xiaoZ.creational.singleton;

import java.io.Serializable;

public class HangrySingleton implements Serializable {
    private final static HangrySingleton instance = new HangrySingleton();
    private HangrySingleton() {
        if (instance != null) {
            throw new RuntimeException("禁止反射");
        }
    }
    public static HangrySingleton getInstance() {
        return instance;
    }

    //防止序列化破坏单例
    private Object readResolve() {
        return instance;
    }
}
