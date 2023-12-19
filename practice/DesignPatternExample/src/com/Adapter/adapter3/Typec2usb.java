package com.Adapter.adapter3;

public class Typec2usb implements USB{
    private TypeC typeC;

    public Typec2usb(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void connect() {
        typeC.chargeBattery();
    }
}
