package com.command.eg1;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command{
    private Chef receive;
    private Order order;

    public OrderCommand() {
    }

    public OrderCommand(Chef receive, Order order) {
        this.receive = receive;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"----"+"");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();
        for (String key : keys) {
            receive.makeFood(key,foodDir.get(key));
        }
        System.out.println(order.getDiningTable()+"----"+"finished");


    }
}
