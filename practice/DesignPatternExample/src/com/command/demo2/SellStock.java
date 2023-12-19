package com.command.demo2;

public class SellStock implements Order{
    private Stock aaaStock;
    public SellStock(Stock aaaStock){
        this.aaaStock=aaaStock;
    }
    @Override
    public void execute() {
        aaaStock.sale();
    }
}
