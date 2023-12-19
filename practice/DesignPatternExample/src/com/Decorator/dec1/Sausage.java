package com.Decorator.dec1;

public class Sausage extends Pancake {
    private Pancake pancake;

    public Sausage(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public double getPrice() {
        //return this.getPrice()+1.5;
        return pancake.getPrice()+1.5;
    }

    @Override
    public String getDescription() {
        return pancake.getDescription()+" sausage";
    }

    @Override
    public String toString() {
        return pancake.toString();
    }
}



