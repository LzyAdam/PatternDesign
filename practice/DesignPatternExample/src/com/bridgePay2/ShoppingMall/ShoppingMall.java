package com.bridgePay2.ShoppingMall;

import com.bridgePay2.paymentMethod.PaymentMethod;

public abstract class ShoppingMall {
    protected PaymentMethod paymentMethod;

    public ShoppingMall() {
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void checkout();
}
