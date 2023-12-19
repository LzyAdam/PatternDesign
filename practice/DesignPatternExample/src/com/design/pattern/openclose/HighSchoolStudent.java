package com.design.pattern.openclose;

public class HighSchoolStudent extends Student{
    @Override
    public void eat() {
        System.out.println("HighSchoolStudent eat");
    }

    @Override
    public void sleep() {
        System.out.println("HighSchoolStudent sleep");
    }

    @Override
    public void study() {
        System.out.println("HighSchoolStudent study");
    }


    public void highSchool() {
        System.out.println("high school student");
    }
}
