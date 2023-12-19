package com.bridgePay2.ShoppingMall;

import com.bridgePay2.paymentMethod.PaymentMethod;

public class TaoBao extends ShoppingMall {


    @Override
    public void checkout() {
        System.out.println("TaoBao bill is: "+"paid by"+paymentMethod);
    }
}
