package com.bridgePay2.paymentMethod;

public class WechatPay implements PaymentMethod {
    public WechatPay() {
    }

    @Override
    public void pay() {
        System.out.println("Use Wechat pay");
    }
}
