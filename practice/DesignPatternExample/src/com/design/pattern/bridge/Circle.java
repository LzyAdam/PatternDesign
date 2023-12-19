package com.design.pattern.bridge;

public class Circle implements Shape{

    @Override
    public void draw(String tools) {
        System.out.println(tools+"draw a circle");
    }


}
