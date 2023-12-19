package com.Observer.eg4;

public class Test {
    public static void main(String[] args) {
        Ob ob= new Weixin("Jack");
        Ob ob1= new Weixin("Rose");
        Subject subject= new Subscribe();
        subject.add(ob);
        subject.add(ob1);
        subject.notification("hi");
    }
}
