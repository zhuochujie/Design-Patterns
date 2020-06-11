package com.xiaoZ.creational.singleton;

/*
既能防御序列化又能防御反射
 */
public enum  EnumSingleton {
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("print test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
