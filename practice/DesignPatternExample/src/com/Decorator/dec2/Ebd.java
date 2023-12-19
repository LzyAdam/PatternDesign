package com.Decorator.dec2;

public class Ebd extends Car {
    private Car car;

    public Ebd(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice()+3000;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+"ebd";
    }
}
