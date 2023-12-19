package com.command.prac1.prac;

public class Test {
    public static void main(String[] args) {
        Stock apple = new Apple();
        Stock ibm = new IBM();
//        Order buyOrder= new BuyStock();
//        Order sellOrder= new SellStock();
        Broker broker= new Broker( );
        broker.takeOrder(new SellStock(apple));
        broker.takeOrder(new BuyStock(ibm));
        broker.takeOrder(new SellStock(ibm));
        broker.takeOrder(new BuyStock(apple));
       // Broker broker2= new Broker( new BuyStock());

        broker.placeOrder();



    }
}
