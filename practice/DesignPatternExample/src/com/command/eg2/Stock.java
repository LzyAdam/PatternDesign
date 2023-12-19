package com.command.eg2;

public class Stock {
    private String name="aaa";
    private int count=10;
    public void buy(){
        System.out.println("buy"+name+count);
    }
    public void sell(){
        System.out.println("sell"+name+count);
    }
}
