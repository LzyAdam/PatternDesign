package com.Observer.eg2.Observer1;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(String message);

}
