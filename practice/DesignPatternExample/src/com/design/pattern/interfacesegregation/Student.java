package com.design.pattern.interfacesegregation;

public class Student implements Eat,Sleep,Swim{


    @Override
    public void sleep() {
        System.out.println("student sleep");
    }

    @Override
    public void eat() {
        System.out.println("student eat");
    }

    @Override
    public void swim() {
        System.out.println("student swim");
    }
}
