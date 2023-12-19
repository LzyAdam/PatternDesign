package com.extend;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Person.demo();
        RepairBill bill=new RepairBill();
        System.out.println( bill.getCode());
        System.out.println( bill.getDesc());
        System.out.println( bill.getCost());
        bill= new Alignment(bill);
        System.out.println( bill.getCode());
        System.out.println( bill.getDesc());
        System.out.println( bill.getCost());
        bill= new Diagnostic(bill);
        System.out.println( bill.getCode());
        System.out.println( bill.getDesc());
        System.out.println( bill.getCost());
    }
}
