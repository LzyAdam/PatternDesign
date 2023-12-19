package com.design.pattern.compositionaggregation;

public class Teacher {
    private Notify notify;

    public void setNotify(Notify notify) {
        this.notify = notify;
    }

    public void call(){
        if(notify instanceof WxNotify){
            ((WxNotify) notify).wxNotify();
        }
    }
}
