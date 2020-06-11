package com.xiaoZ.structural.decorator;

public class Main {
    public static void main(String[] args) {
        ABatterCake batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getDesc());
        System.out.println(batterCake.cost());
    }
}
