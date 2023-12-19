package com.Factory.Method;


public class CoffeeStore {
    private CoffeeFactory coffeeFactory;
    public CoffeeStore(CoffeeFactory coffeeFactory){
        this.coffeeFactory=coffeeFactory;
    }
    public Coffee orderCoffee(String type){
      return coffeeFactory.createCoffee();
    }
}
