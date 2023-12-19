package com.bridge;

public class Square extends Shape{
    @Override
    public void draw() {
        color.paint();
        System.out.println("Square");
    }
}
