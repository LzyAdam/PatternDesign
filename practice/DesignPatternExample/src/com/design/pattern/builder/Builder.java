package com.design.pattern.builder;

public abstract class Builder {
    public abstract void buildBasePlate(String basePlate);
    public abstract void buildFrame(String baseFrame);
    public abstract void buildDoor(String baseDoor);
    public abstract Car makeCar();
}
