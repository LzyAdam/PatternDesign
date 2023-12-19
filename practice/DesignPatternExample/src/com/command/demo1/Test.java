package com.command.demo1;

public class Test {
    public static void main(String[] args) {
        Order order1= new Order();
        order1.setDiningTable(1);
        order1.setFood("pizza",1);
        order1.setFood("coke",5);
        Order order2= new Order();
        order2.setDiningTable(2);
        order2.setFood("sandwich",1);
        order2.setFood("coke",5);
        SeniorChef receiver= new SeniorChef();
        OrderCommand cmd1=new OrderCommand(receiver,order1);
        OrderCommand cmd2=new OrderCommand(receiver,order2);
        Waiter invoke=new Waiter();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);

        invoke.orderUp();


    }
}
