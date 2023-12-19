package com.Observer.eg2.Observer1;

public class Test {
    public static void main(String[] args) {
        SubscripttionSubject subject= new SubscripttionSubject();
        subject.attach(new Weixin("mike"));
        subject.attach(new Weixin("Jack"));
        subject.notify("____update today");




    }
}
