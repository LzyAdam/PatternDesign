package com.design.pattern.bridge;

public class Test {
    public static void main(String[] args) {
        Tools tools=new Pencil(new Circle());
        tools.use();
    }
}
