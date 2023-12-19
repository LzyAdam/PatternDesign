package com.Observer.eg3;

public class Test {
    public static void main(String[] args) {
        Observer observer1= new StudentObserver();
        Observer observer2= new StudentObserver();
        Observer observer3 = new TeacherObserver();
        Subject subject= new BellSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.notifyObserver();
    }
}
