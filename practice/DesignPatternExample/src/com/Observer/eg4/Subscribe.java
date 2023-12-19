package com.Observer.eg4;

import java.util.ArrayList;
import java.util.List;

public class Subscribe implements Subject{
    List<Ob> obList = new ArrayList<>();
    @Override
    public void add(Ob ob) {
        obList.add(ob);
    }

    @Override
    public void remove(Ob ob) {
    obList.remove(ob);
    }

    @Override
    public void notification(String message) {
        for (Ob ob1 : obList) {
            ob1.upDate(message);
        }
    }
}
