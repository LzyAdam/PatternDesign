package com.State.eg1;

public class Test {
    public static void main(String[] args) {
            Context context= new Context();
            context.setLifeState(new OpenState());
            context.open();
            context.close();
            context.run();
            context.stop();



    }
}
