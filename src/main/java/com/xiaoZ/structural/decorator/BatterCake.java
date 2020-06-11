package com.xiaoZ.structural.decorator;

public class BatterCake extends ABatterCake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
