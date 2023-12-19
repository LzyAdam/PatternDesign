package com.design.pattern.singleresponse;



public class JavaProgrammer extends Programmer {
    private Order order;
    public void setOrder(Order order){
        this.order=order;
    }

    public void eat(Order order)
    {
        order.take();
        System.out.println("java programmer eat take outs");
    }

    @Override
    public void sleep() {
        System.out.println("java programmer sleep");
    }
//    public  void order(){
//        System.out.println("java order deliver");
//    }
    @Override
    public void work() {
        System.out.println("java programmer working");
    }
}
