package com.facade.eg2;

public class Test {
    public static void main(String[] args) {
        TakingSystem takingSystem= new TakingSystem();
        Food food= new Food();
        food.setName("pizza");
        takingSystem.orderTracking(food);
    }
}
