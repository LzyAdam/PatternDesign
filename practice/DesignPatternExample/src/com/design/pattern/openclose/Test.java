package com.design.pattern.openclose;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.eat();
        student.sleep();
        student.study();
        //student.highSchool();


        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.eat();
        highSchoolStudent.highSchool();
        highSchoolStudent.sleep();
        highSchoolStudent.study();




    }
}
