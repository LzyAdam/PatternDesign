package com.bridge;

public class Test {
    public static void main(String[] args) {
        Shape shape =new Round();
        //Round round = (Round) shape;

        Color blue=shape.setColor(new Blue());
        blue.paint();
        shape.draw();
    }
}
