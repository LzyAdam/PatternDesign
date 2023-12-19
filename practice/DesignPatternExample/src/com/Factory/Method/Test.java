package com.Factory.Method;

public class Test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore=new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee=coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }


}
