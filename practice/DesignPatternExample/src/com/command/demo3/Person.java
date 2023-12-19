package com.command.demo3;

public class Person {
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void doIt(){
        command.execute();
    }
    public void unDo(){
        command.revoke();
    }

}
