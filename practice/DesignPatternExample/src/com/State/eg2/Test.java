package com.State.eg2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setCurrentState(new FullState());
        person.doWork();
        person.eatFood();
        person.playball();
        person.doWork();
        person.eatFood();
        person.playball();
    }
}
