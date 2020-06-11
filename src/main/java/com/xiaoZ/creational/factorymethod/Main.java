package com.xiaoZ.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        VideoFactory factory = new PythonVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }
}
