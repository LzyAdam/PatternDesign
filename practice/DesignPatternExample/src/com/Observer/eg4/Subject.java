package com.Observer.eg4;

public interface Subject {
    void add(Ob ob);
    void remove(Ob ob);
    void notification(String message);
}
