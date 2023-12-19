package com.Adapter.adapter3;

public class Test {
    public static void main(String[] args) {
       USB usb1= new USBimpl();
       usb1.connect();
        USB usb = new Typec2usb(new TypeC());
        usb.connect();



    }
}
