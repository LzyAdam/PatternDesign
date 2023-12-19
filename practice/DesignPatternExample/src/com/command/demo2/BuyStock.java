package com.command.demo2;

public class BuyStock implements Order{
    private Stock aaastock;
    public BuyStock(Stock aaastock){
        this.aaastock=aaastock;
    }
    @Override
    public void execute() {
        aaastock.buy();
    }
}
