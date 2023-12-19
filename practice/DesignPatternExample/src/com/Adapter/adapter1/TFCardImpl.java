package com.Adapter.adapter1;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "TFcard read: hello world tfcard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf write"+msg);
    }
}
