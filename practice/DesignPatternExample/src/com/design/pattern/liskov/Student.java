package com.design.pattern.liskov;

public class Student extends Human{
    private Teacher teacher;
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public int fun1(int a, int b) {
        return a-b;
    }
    public  int fun2(int a, int b){
        return a+b+10;
    }
    public int fun3(int a, int b){
        return teacher.fun1(a, b);
    }

}
