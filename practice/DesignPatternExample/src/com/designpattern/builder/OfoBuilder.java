package com.designpattern.builder;

public class OfoBuilder extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("iron");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("rubber");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
