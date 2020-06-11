package com.xiaoZ.structural.decorator;

public abstract class AbstractDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public AbstractDecorator() {
    }

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    public String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    public int cost() {
        return this.aBatterCake.cost();
    }
}
