package com.State.eg2;

public class HugreyState implements State{
    @Override
    public void eat() {
        System.out.println("eat a lot");
    }

    @Override
    public void play(Person person) {
        System.out.println("cannot");
    }

    @Override
    public void work() {
        System.out.println("cannnot");
    }
}
