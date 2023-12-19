package com.BuilderDemo;

public class AHouse implements Builder{
    private House house=new House();
    @Override
    public void paintWall() {
        house.setWall("Green");
    }

    @Override
    public void installDoor() {
        house.setDoor("wood");
    }

    @Override
    public String toString() {
        return "AHouse{" +
                "house=" + house +
                '}';
    }
}
