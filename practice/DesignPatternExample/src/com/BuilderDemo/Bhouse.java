package com.BuilderDemo;

public class Bhouse implements Builder{
    private House house=new House();

    @Override
    public void paintWall() {
        house.setWall("red");
    }

    @Override
    public void installDoor() {
    house.setDoor("iron");
    }

    @Override
    public String toString() {
        return "Bhouse{" +
                "house=" + house +
                '}';
    }
}
