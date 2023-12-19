package com.State.eg2;

public class FullState implements State{
    @Override
    public void eat() {
        System.out.println("no");
    }

    @Override
    public void play(Person person) {
        System.out.println("yes");
        person.setCurrentState(new HugreyState());
    }

    @Override
    public void work() {
        System.out.println("yes");
    }
}
