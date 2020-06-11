package com.xiaoZ.structural.facade;

//物流子系统
public class ShippingService {
    public String shipGift(PointGift pointGift) {
        System.out.println(pointGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
