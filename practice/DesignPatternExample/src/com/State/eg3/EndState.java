package com.State.eg3;

public class EndState implements State{
    @Override
    public void operator(Context context) {
        System.out.println("end ........");

    }
    public String toString(){
        return "ending...........";
    }
}
