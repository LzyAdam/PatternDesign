package com.command.prac1.prac;

public class IBM implements Stock{
    private String name="IBM";
    private int quantity=100;



    @Override
    public void buy() {
        System.out.println("buy "+name+"  "+quantity);
    }

    @Override
    public void sell() {
        System.out.println("sell "+name+"  "+quantity);
    }
}
