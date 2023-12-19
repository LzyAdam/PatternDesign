package com.bridgePay2.ShoppingMall;

import com.bridgePay2.paymentMethod.PaymentMethod;

public class JD extends ShoppingMall {



    @Override
    public void checkout() {
        System.out.println("JD bill is: "+"paid by");
        paymentMethod.pay();
    }
}
