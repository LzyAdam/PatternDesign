package com.Adapter.adapter2;

public class Adapter extends DC220v implements AC5V{
    @Override
    public void out5v() {
        System.out.println("out "+super.output()/40);
    }
}
