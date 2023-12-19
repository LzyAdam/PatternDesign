package com.command.prac1.prac;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }
    void placeOrder(){
        for (Order order : orderList) {
            order.execute();
        }
    }

}
