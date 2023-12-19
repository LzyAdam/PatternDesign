package com.bridgePay.ShoppingMall;

import com.bridgePay.paymentMethod.PaymentMethod;

public abstract class ShoppingMall {
    protected PaymentMethod paymentMethod;
    public ShoppingMall(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public abstract void checkout();
}
