package com.Template.eg3;

public  abstract class StudyTemplate {
    protected final void study(){
        preview();
        listen();
        review();
    }
    abstract void preview();
    abstract void listen();
    abstract void review();


}
