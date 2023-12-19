package com.command.demo4;

import com.command.demo4.cusine.ICusine;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<ICusine> iCusineList=new ArrayList<>();
    public Waiter(ICusine iCusine){
        iCusineList.add(iCusine);
    }
    public void placeOrder(){
        for(ICusine iCusine: iCusineList){
            iCusine.cook();
        }
        iCusineList.clear();
    }

}
