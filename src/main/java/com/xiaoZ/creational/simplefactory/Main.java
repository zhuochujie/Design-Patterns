package com.xiaoZ.creational.simplefactory;

public class Main {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(Main.class);
        video.produce();
    }
}
