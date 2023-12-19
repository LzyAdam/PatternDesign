package com.design.pattern.dependencyinversion;

public class JavaProgrammer extends Programmer{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void work() {
        System.out.println("java programmer working");
    }
}
