package com.Observer.eg2.Observer1;

public class Weixin implements Observer{
    private String name;

    public Weixin(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+message);
    }
}
