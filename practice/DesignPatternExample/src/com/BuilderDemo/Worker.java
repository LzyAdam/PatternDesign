package com.BuilderDemo;

public class Worker {
    Builder builder;
    public Worker (Builder builder){
        this.builder=builder;
    }
    public Builder doingJob(){
        builder.installDoor();
        builder.paintWall();
        return builder;
    }
}
