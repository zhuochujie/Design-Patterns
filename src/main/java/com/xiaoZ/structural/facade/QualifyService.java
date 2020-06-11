package com.xiaoZ.structural.facade;

//资格校验子系统
public class QualifyService {
    public boolean isAvailable(PointGift pointGift) {
        System.out.println("校验" + pointGift.getName() + "积分资格通过");
        return true;
    }
}
