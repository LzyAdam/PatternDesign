package com.bridgePay;

import com.bridgePay.ShoppingMall.JD;
import com.bridgePay.ShoppingMall.ShoppingMall;
import com.bridgePay.paymentMethod.PaymentMethod;
import com.bridgePay.paymentMethod.WechatPay;

public class Test {
    public static void main(String[] args) {
        ShoppingMall shoppingMall =new JD(new WechatPay());
        shoppingMall.checkout();
    }
}
