package com.Factory.Before;

public class Test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee coffee=coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());

    }
}
