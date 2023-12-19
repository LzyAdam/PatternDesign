package com.facade.eg1;

public class Alexa {
   private Light light;
   private Air air;
   private TV tv;

    public Alexa() {
        light=new Light();
        air=new Air();
        tv=new TV();
    }
    public void say(String message){
        if(message.contains("open")){
            on();
        }else if(message.contains("close")){
            off();
        }
    }
    private void  on(){
        light.on();
        tv.on();
        air.on();
    }
    private void  off(){
        light.off();
        tv.off();
        air.off();

    }


}
