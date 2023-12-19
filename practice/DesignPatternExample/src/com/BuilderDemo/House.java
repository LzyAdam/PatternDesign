package com.BuilderDemo;

public class House {
    private String door;
    private String wall;

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", wall='" + wall + '\'' +
                '}';
    }
}
