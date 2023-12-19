package com.designpattern.builder;

public class Bike {
    private String frame;
    private String seat;

    public String getFrame() {
        return frame;
    }

    public Bike() {
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
