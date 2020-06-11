package com.xiaoZ.structural.adapter.classadapter;

public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int outputDC5V() {
        int adapterInput = super.outputAC220V();
        //变压器
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入" + adapterInput + "V,输出" + adapterOutput + "V");
        return adapterOutput;
    }
}
