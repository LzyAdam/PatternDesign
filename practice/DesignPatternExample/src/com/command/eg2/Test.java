package com.command.eg2;

public class Test {
    public static void main(String[] args) {
        Stock aaaStock = new Stock();
        BuyStock buyStock= new BuyStock(aaaStock);
        SellStock sellStock= new SellStock(aaaStock);
        Broker broke1r= new Broker();
        broke1r.takeOrder(buyStock);
        broke1r.takeOrder(sellStock);
        broke1r.placeOrder();

    }



}
