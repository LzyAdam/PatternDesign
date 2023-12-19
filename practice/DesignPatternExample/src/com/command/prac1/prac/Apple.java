package com.command.prac1.prac;

public class Apple implements Stock {
    private String name="apple";
    private int quantity=10;


    public void buy(){
        System.out.println("buy "+name+"  "+quantity);
    }
    public void sell(){
        System.out.println("sell "+name+"  "+quantity);
    }

}
