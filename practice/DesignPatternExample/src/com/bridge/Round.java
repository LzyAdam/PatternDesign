package com.bridge;

public class Round extends Shape{


    @Override
    public void draw() {
        System.out.println("round");
        System.out.println(this.color);
        color.paint();
    }
}
