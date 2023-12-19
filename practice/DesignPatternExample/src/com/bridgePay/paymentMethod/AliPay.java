package com.bridgePay.paymentMethod;

public class AliPay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Use Ali pay");
    }
}
