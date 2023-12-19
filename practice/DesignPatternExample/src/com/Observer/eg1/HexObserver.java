package com.Observer.eg1;

public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject=subject;
        this.subject.binding(this);
    }

    @Override
    public void update() {
        System.out.println("hex"+Integer.toHexString(subject.getState()));
    }
}
