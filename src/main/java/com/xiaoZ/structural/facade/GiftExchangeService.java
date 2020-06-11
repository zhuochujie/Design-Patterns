package com.xiaoZ.structural.facade;

//门面
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointPaymentService paymentService = new PointPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointGift pointGift) {
        if (qualifyService.isAvailable(pointGift)) {
            //资格校验通过
            if (paymentService.pay(pointGift)) {
                //如果支付成功
                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("兑换成功.物流号:"+shippingOrderNo);
            }
        }
    }
}
