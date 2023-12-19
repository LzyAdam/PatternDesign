package com.designpattern.decorator;

public class Test {
    public static void main(String[] args) {

        Pancake pancake=new ChinaPancake();
        pancake=new EggDecorator(pancake);
        System.out.println(pancake.getInfo()+"--"+pancake.cost());




    }
}
