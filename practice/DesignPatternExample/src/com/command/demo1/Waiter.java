package com.command.demo1;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;
public class Waiter {
    private List<Command> commands = new ArrayList<Command>();
    public void setCommand(Command cmd){
        commands.add(cmd);
    }
    public void orderUp(){
        System.out.println("order .......");
        for(Command command: commands){
            if(command!=null){
                command.execute();
            }
        }
    }


}
