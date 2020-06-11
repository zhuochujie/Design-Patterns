package com.xiaoZ.structural.facade;

public class Main {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("程序员背包");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointGift);
    }
}
