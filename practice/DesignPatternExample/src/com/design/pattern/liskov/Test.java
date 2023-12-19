package com.design.pattern.liskov;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.fun1(2,3);
        System.out.println(teacher.fun1(2,3));
        Student student=new Student();
        student.fun1(1,2);
        System.out.println(student.fun1(1,2));
        student.setTeacher(teacher);
        System.out.println(student.fun3(1,2));

    }
}
