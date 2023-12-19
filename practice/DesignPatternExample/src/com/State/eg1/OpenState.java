package com.State.eg1;

public class OpenState extends LifeState{
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        super.context.setLifeState(Context.CLOSE_STATE);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
