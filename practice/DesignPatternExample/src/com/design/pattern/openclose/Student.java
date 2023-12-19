package com.design.pattern.openclose;

public class Student implements Human{
    @Override
    public void eat() {
        System.out.println("Student eat");
    }

    @Override
    public void sleep() {
        System.out.println("Student sleep");
    }

    public void study(){
        System.out.println("Student study");
    }
//     public void highSchool(){
//         System.out.println("I am high school student");
//     }


}
