package com.designpattern.builder;

public class MobileBuilder extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("carbon");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("leather");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
