package com.design.pattern.builder;

public class Engineer {
    private  CarBuilder carBuilder;
    public  void setCarBuilder(CarBuilder carBuilder){
        this.carBuilder =carBuilder;
    }
    public Car makeCar(String basePlate,String frame,String door){
        System.out.println("1111");
        carBuilder.buildBasePlate(basePlate);
        carBuilder.buildFrame(frame);
        carBuilder.buildDoor(door);
        return carBuilder.makeCar();
    }



}
