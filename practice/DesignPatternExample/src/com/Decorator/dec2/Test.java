package com.Decorator.dec2;

public class Test {
    public static void main(String[] args) {
        Car car= new Car();
        System.out.println( car.getDesc());
        System.out.println(car.getDesc());
        System.out.println(car.getPrice());
        System.out.println(car.toString());
        car= new Abs(car);

        System.out.println(car.getDesc());
        System.out.println(car.getPrice());
        System.out.println(car.toString());
        car= new Ebd(car);
        System.out.println(car.getDesc());
        System.out.println(car.getPrice());

    }
}
