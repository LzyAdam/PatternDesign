package com.Observer.eg2.Observer1;

import java.util.ArrayList;
import java.util.List;

public class SubscripttionSubject implements Subject{
    private List<Observer>weixinList= new ArrayList<>();
    @Override
    public void attach(Observer observer) {
    weixinList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinList) {
            observer.update(message);
        }
    }
}
