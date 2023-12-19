package com.Template.eg3;

public class StudyCook extends StudyTemplate {
    @Override
    void preview() {
        System.out.println("materail prepare");
    }

    @Override
    void listen() {
        System.out.println("watch vedio");
    }

    @Override
    void review() {
        System.out.println("do again");
    }
}
