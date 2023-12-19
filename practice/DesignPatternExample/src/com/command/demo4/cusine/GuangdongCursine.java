package com.command.demo4.cusine;

import com.command.demo4.cook.ICook;

public class GuangdongCursine implements ICusine {
    private ICook cook;
    public GuangdongCursine(ICook cook){
        this.cook=cook;
    }
    @Override
    public void cook() {
        cook.doCokking();
    }
}
