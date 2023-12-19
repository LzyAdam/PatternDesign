package com.Decorator.dec1;

public class Test {
    public static void main(String[] args) {
        Pancake pancake=new Pancake();
//        System.out.println(pancake.getDescription());
//        System.out.println(pancake.getPrice());
//        System.out.println(pancake);
        pancake=new Sausage(pancake);
//        System.out.println(pancake.getDescription());
//        System.out.println(pancake.getPrice());
        pancake=new Egg(pancake);
        System.out.println(pancake.getDescription());
        System.out.println(pancake.getPrice());

    }
}
