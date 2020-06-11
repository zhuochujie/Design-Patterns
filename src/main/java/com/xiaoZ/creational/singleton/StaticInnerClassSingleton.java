package com.xiaoZ.creational.singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }
    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

}
