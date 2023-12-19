package com.design.pattern.dependencyinversion;

public class Test {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer =new JavaProgrammer();
        javaProgrammer.eat();
        javaProgrammer.work();
        javaProgrammer.sleep();
        Testprogrammer testprogrammer = new Testprogrammer();
        testprogrammer.work();
        testprogrammer.eat();

    }
}
