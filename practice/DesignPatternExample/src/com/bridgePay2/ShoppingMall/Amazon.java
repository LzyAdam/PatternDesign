package com.bridgePay2.ShoppingMall;

import com.bridgePay2.paymentMethod.PaymentMethod;

public class Amazon extends ShoppingMall {



    @Override
    public void checkout() {
        System.out.println("Amazon bill is: "+"paid by"+paymentMethod);
    }
}
