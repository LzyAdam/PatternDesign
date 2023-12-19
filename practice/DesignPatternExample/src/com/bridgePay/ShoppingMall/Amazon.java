package com.bridgePay.ShoppingMall;

import com.bridgePay.paymentMethod.PaymentMethod;

public class Amazon extends ShoppingMall{

    public Amazon(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void checkout() {
        System.out.println("Amazon bill is: "+"paid by"+paymentMethod);
    }
}
