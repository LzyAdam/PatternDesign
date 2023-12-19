package com.design.pattern.builder;

public class Test {
    public static void main(String[] args) {
        CarBuilder carBuilder= new CarBuilder();
        Engineer engineer =new Engineer();
        engineer.setCarBuilder(carBuilder);
        Car car=engineer.makeCar("basePlate","frame","door");
        System.out.println(car);
    }
}
