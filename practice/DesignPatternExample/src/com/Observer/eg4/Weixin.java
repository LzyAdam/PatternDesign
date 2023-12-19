package com.Observer.eg4;

public class Weixin implements Ob {
    private String name;

    public Weixin(String name) {
        this.name = name;
    }

    @Override
    public void upDate(String message) {
        System.out.println(name+""+message);
    }
}
