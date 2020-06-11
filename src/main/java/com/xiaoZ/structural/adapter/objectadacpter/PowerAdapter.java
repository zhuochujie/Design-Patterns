package com.xiaoZ.structural.adapter.objectadacpter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        //变压器
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入" + adapterInput + "V,输出" + adapterOutput + "V");
        return adapterOutput;
    }
}
