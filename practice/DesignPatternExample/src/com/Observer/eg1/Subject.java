package com.Observer.eg1;

import java.util.*;
import java.util.List;

public class Subject {
    private List<Observer>observerList= new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    public void binding(Observer observer){
        observerList.add(observer);

    }
    public  void notifyObservers(){
        for(Observer observer:observerList){
            observer.update();
        }
    }



}
