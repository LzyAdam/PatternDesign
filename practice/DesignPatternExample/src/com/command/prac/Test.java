package com.command.prac;

public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock();
//        Order buyOrder= new BuyStock();
//        Order sellOrder= new SellStock();
        Broker broker= new Broker( );
        broker.takeOrder(new SellStock(stock));
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new SellStock(stock));
       // Broker broker2= new Broker( new BuyStock());

        broker.placeOrder();



    }
}
