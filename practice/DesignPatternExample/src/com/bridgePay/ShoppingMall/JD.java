package com.bridgePay.ShoppingMall;

import com.bridgePay.paymentMethod.PaymentMethod;

public class JD extends ShoppingMall{

    public JD(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void checkout() {
        System.out.println("JD bill is: "+"paid by");
        paymentMethod.pay();
    }
}
