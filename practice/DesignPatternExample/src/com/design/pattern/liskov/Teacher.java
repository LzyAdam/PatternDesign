package com.design.pattern.liskov;

public class Teacher extends Human {
    public int fun1(int a, int b){
        System.out.println("a+b"+": "+a+b);
        return a+b;
    }
}
