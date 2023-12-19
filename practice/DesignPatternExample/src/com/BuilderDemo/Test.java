package com.BuilderDemo;

public class Test {
    public static void main(String[] args) {
        Worker worker=new Worker(new Bhouse());
        worker.doingJob();
        System.out.println();
        System.out.println(worker.doingJob());




    }
}
