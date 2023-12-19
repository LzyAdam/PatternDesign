package com.Decorator.dec1;

public class Egg extends Pancake{
    private Pancake pancake;

    public Egg(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public double getPrice() {
        return pancake.getPrice()+1;
    }

    @Override
    public String getDescription() {
        return pancake.getDescription()+" egg";
    }
}
