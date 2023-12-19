package com.command.demo3;

public class TVCommand implements Command{
    private Tv tv;
    TVCommand(Tv tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.open();
    }

    @Override
    public void revoke() {
        tv.close();
    }
}
