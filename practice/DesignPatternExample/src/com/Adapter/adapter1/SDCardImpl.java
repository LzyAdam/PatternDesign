package com.Adapter.adapter1;

public class SDCardImpl implements SdCard{
    @Override
    public String readSD() {
        return "read sd";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println(msg+"sd write");
    }
}
