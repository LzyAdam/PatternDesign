package com.Template.eg1;

public abstract class AbstractClass {
    //mode
    public final void cookProcess(){
        pourOil();
        pourVegetable();
        pourSeason();
        fry();
    }




    public void pourOil(){
        System.out.println("pourOil");
    }
    public abstract void pourVegetable();
    public abstract void pourSeason();
    public void fry(){
        System.out.println("fry the dish");
    }



}
