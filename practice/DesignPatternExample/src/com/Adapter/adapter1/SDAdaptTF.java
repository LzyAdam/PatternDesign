package com.Adapter.adapter1;

public class SDAdaptTF extends TFCardImpl implements SdCard{
    @Override
    public String readSD() {
        System.out.println("adp read tf");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adp read tf");
        System.out.println(msg);
    }
}
