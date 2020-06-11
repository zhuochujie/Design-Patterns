package com.xiaoZ.structural.facade;

//支付子系统
public class PointPaymentService {
    public boolean pay(PointGift pointGift) {
        //扣减积分
        System.out.println("支付" + pointGift.getName() + "积分成功");
        return true;
    }
}
