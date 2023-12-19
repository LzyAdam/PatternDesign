package com.State.eg3;

public class StartState implements State{
    @Override
    public void operator(Context context) {
        System.out.println("start.......");
        context.setState(this);
    }
    public String toString(){
        return "on going..........";
    }
}
