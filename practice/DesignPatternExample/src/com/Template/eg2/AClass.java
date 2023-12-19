package com.Template.eg2;

public abstract class AClass {
    protected final void makeClass(){
        this.makePPT();
        if(flag()){
            this.makeNote();
        }
        this.makeVideo();
    }
    public final void makePPT(){
        System.out.println("make ppt");
    }
    public final void makeVideo(){
        System.out.println("make video");
    }
    public final void makeNote(){
        System.out.println("make vnote");
    }
    protected  boolean flag(){
        return false;
    }
    public abstract void isMakeNote();


}
