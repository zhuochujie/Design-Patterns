package com.xiaoZ.creational.simplefactory;

public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("生产Java视频");
    }
}
