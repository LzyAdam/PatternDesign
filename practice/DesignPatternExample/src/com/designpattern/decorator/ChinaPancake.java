package com.designpattern.decorator;

public class ChinaPancake extends Pancake{
    @Override
    protected String getInfo() {
        return "panc";
    }

    @Override
    protected int cost() {
        return 6;
    }
}
