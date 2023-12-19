package com.Factory.Simple;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee coffee=coffeeStore.orderCoffee("latte");
    }
}
