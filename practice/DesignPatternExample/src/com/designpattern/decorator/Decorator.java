package com.designpattern.decorator;

public abstract class Decorator extends Pancake{
    private Pancake pancake;
    public  Decorator(Pancake pancake){
        this.pancake=pancake;
    }
    @Override
    protected String getInfo() {
        return this.pancake.getInfo();
    }

    @Override
    protected int cost() {
        return this.pancake.cost();
    }
    public void someThing(){

    }
}
