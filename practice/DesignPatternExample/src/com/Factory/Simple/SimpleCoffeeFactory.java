package com.Factory.Simple;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee=null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("sorry we dont have that");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
