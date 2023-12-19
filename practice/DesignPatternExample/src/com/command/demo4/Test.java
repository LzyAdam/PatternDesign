package com.command.demo4;

import com.command.demo4.cook.GuangdongCook;
import com.command.demo4.cook.ICook;
import com.command.demo4.cusine.GuangdongCursine;
import com.command.demo4.cusine.ICusine;

public class Test {
    public static void main(String[] args) {
        ICook gdcook=new GuangdongCook();
        ICusine gd = new GuangdongCursine(gdcook);
        Waiter waiter= new Waiter(gd);
        waiter.placeOrder();


    }
}
