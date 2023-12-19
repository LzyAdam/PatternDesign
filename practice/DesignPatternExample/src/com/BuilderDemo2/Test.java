package com.BuilderDemo2;

public class Test {
    public static void main(String[] args) {
       House house = new House.Builder().door("iron").create();
        System.out.println(house);


    }
}
