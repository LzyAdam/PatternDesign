package com.Factory.Simple;


public class CoffeeStore {
    public Coffee orderCoffee(String type){
       SimpleCoffeeFactory simpleCoffeeFactory=new SimpleCoffeeFactory();
       Coffee coffee =simpleCoffeeFactory.createCoffee(type);
       return coffee;
    }
}
