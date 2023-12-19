package com.design.pattern.builder;

public class CarBuilder extends Builder{
    private Car car= new Car();
    //得new对象这里 因为传入的是属性不是对象

    @Override
    public void buildBasePlate(String basePlate) {
        car.setBasePlate(basePlate);
    }

    @Override
    public void buildFrame(String baseFrame) {
        car.setBasePlate(baseFrame);
    }

    @Override
    public void buildDoor(String baseDoor) {
        car.setDoor(baseDoor);
    }

    @Override
    public Car makeCar() {
        return car;
    }
}
