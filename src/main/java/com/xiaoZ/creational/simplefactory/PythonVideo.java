package com.xiaoZ.creational.simplefactory;

public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("生产python视频");
    }
}
