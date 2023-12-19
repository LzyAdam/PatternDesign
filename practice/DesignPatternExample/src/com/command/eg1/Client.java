package com.command.eg1;

public class Client {
    public static void main(String[] args) {
        Order order1= new Order();
        order1.setDiningTable(1);
        order1.setFood("pizza",2);
        Order order2= new Order();
        order2.setDiningTable(2);
        order2.setFood("sanwich",10);

        Chef chef= new Chef();
        OrderCommand cmd1= new OrderCommand(chef,order1);

        Waiter waiter= new Waiter();
        waiter.setCommand(cmd1);
        waiter.orderUp();







    }
}
