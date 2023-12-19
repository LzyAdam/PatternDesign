package com.Observer.eg3;

import java.util.ArrayList;
import java.util.List;

public class BellSubject extends Subject{
    List<Observer> observers = new ArrayList<>();
    void addObserver(Observer observer){
        observers.add(observer);
    }
    void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    void notifyObserver() {
        for (Observer observer1 : observers) {
            observer1.response();
        }
    }




}
