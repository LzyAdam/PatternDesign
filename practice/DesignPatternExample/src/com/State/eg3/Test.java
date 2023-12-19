package com.State.eg3;

public class Test {
    public static void main(String[] args) {
        Context context= new Context();
        State start = new StartState();
        start.operator(context);
        System.out.println(88);
        System.out.println(context.getState().toString());
    }
}
