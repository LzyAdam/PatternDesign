package com.Observer.eg3;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    void addObserver(Observer observer){
        observers.add(observer);
    }
    void removeObserver(Observer observer){
        observers.remove(observer);
    }
    abstract void  notifyObserver();


}
