package com.design.pattern.bridge;

public class Square implements Shape{
    @Override
    public void draw(String tools) {
        System.out.println(tools+"huafangxing");
    }
}
