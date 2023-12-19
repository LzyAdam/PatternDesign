package com.Adapter.adapter3;

public class Lan2USb implements USB{
    private LAN lan;
    public Lan2USb(LAN lan){
        this.lan=lan;
    }
    @Override
    public void connect() {
        lan.connectWeb();
    }
}
