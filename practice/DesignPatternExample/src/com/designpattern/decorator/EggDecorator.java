package com.designpattern.decorator;

public class EggDecorator extends Decorator{

    public EggDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    protected String getInfo() {
        return super.getInfo()+"egg";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }

    @Override
    public void someThing() {
        super.someThing();
    }
}
