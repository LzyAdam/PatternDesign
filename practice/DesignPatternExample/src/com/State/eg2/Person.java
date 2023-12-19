package com.State.eg2;

public class Person {
    private  State HungreyState;
    private  State FullState;
    private State CurrentState;
    public void setCurrentState(State state){
        CurrentState=state;
    }
    public void eatFood(){
        CurrentState.eat();
    }
    public void doWork(){
        CurrentState.work();
    }
    public void playball(){
        CurrentState.play(this);
    }
}
