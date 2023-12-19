package com.command.demo3;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        LightCommand lightCommand=new LightCommand(new Light());
        person.setCommand(lightCommand);
        person.doIt();
        person.setCommand(new TVCommand(new Tv()));
        person.unDo();




    }
}
