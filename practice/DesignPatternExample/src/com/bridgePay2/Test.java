package com.bridgePay2;

import com.bridgePay.paymentMethod.PaymentMethod;
import com.bridgePay2.ShoppingMall.Amazon;
import com.bridgePay2.ShoppingMall.JD;
import com.bridgePay2.ShoppingMall.ShoppingMall;
import com.bridgePay2.ShoppingMall.TaoBao;
import com.bridgePay2.paymentMethod.ApplePay;
import com.bridgePay2.paymentMethod.WechatPay;

public class Test {
    public static void main(String[] args) {
        ShoppingMall shoppingMall =new JD();
        shoppingMall.setPaymentMethod(new ApplePay());
        shoppingMall.setPaymentMethod(new WechatPay());
        shoppingMall.checkout();

        ShoppingMall shoppingMall1 =new TaoBao();


        ShoppingMall shoppingMall2 =new Amazon();




    }

}
