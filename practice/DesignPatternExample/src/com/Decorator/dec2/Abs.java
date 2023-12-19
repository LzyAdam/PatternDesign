package com.Decorator.dec2;

public class Abs extends Car{
   private Car car;

    public Abs(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice()+1100;
    }

    @Override
    public String getDesc() {
        return car.getDesc()+11;
    }

    @Override
    public String toString() {
        return car.toString();
    }
}
