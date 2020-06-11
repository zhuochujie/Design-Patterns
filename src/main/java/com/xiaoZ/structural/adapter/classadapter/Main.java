package com.xiaoZ.structural.adapter.classadapter;

public class Main {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
