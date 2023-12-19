package com.bridgePay2.paymentMethod;

public class ApplePay implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Use Apple pay");
    }
}
