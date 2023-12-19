package com.command.eg1;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commands= new ArrayList<>();
    public  void setCommand(Command cmd){
        commands.add(cmd);
    }
    public void orderUp(){
        for (Command command : commands) {
            command.execute();
        }
    }



}
