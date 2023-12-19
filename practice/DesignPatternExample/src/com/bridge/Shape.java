package com.bridge;

public abstract class Shape {
    protected Color color;

    public  Color setColor(Color color){
       this.color=color;
       return color;
  }

//    public  void setColor(Color color){
//        this.color=color;
//    }
    public abstract void draw();
}
