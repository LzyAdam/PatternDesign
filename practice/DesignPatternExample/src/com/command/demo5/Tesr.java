package com.command.demo5;

public class Tesr {
    public static void main(String[] args) {

        Order order1= new Order();
        order1.setDiningTable(1);
        order1.setFood("pizza",2);
        Order order2= new Order();
        order2.setDiningTable(1);
        order2.setFood("pizza1111",211);

        Chef chef=new Chef();
        OrderCommand cmd1 = new OrderCommand(chef,order1);

        Waiter waiter= new Waiter();
        waiter.setCommand(cmd1);
        waiter.orderUp();



    }
}
