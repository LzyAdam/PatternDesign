package com.command.demo5;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command{
    private Chef chef;
    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable());
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keys =foodDir.keySet();
        for(String foodName: keys){
            chef.makefood(foodName,foodDir.get(foodName));

        }
        System.out.println(order.getDiningTable()+" okay");

    }
}
