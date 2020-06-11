package com.xiaoZ.creational.factorymethod;

public class PythonVideoFactory implements VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
