package com.command.demo1;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command{
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+" table order");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String>keys=foodDir.keySet();
        for (String foodName: keys){
            receiver.makeFood(foodName,foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable()+" finish");

    }
}
