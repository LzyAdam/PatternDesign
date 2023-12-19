package com.design.pattern.dependencyinversion;

public abstract class Programmer implements Human{
    @Override
    public void eat() {
        System.out.println("programmer eat");
    }

    @Override
    public void sleep() {
        System.out.println("programmer sleep");
    }

    public abstract void work();



}
