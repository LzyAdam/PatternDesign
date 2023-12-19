package com.Observer.eg1;

public class Test {
    public static void main(String[] args) {

        Subject subject= new Subject();
        new HexObserver(subject);
        subject.setState(15);


    }
}
