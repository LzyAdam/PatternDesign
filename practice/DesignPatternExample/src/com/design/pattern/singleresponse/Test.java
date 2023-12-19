package com.design.pattern.singleresponse;



public class Test {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer =new JavaProgrammer();
       //javaProgrammer.eat(new Order());
        //javaProgrammer.work();
//        javaProgrammer.sleep();
        //Order order = new Order();
        javaProgrammer.setOrder(new Order());
        javaProgrammer.eat();

    }
}
