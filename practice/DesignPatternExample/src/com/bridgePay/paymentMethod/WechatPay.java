package com.bridgePay.paymentMethod;

public class WechatPay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Use Wechat pay");
    }
}
