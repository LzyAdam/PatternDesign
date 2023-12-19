package com.bridgePay.ShoppingMall;

import com.bridgePay.paymentMethod.PaymentMethod;

public class TaoBao extends ShoppingMall{
    public TaoBao(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void checkout() {
        System.out.println("TaoBao bill is: "+"paid by"+paymentMethod);
    }
}
