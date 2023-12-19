package com.extend;

public class Alignment extends RepairBill implements RepairProcedureAPI{
    private String code;
    private String desc=" ";
    private double cost=0.0;
    private RepairBill repairBill;

    public Alignment(String code, String desc, double cost, RepairBill repairBill) {
        this.code = code;
        this.desc = desc;
        this.cost = cost;
        this.repairBill = repairBill;
    }

    public Alignment(RepairBill repairBill) {
        this.repairBill = repairBill;
    }
    @Override
    public String getCode() {
        return repairBill.getCode()+"180";
    }


//
//    @Override
//    public String getDesc() {
//        System.out.println("super");
//        return super.getDesc()+" Alignment";
//    }
//
    @Override
    public double getCost() {
        return repairBill.getCost()+100;
    }

//    @Override
//    public String getCode() {
//        return this.getCode()+"80";
//    }
//
//    @Override
//    public String getDesc() {
//        return this.getDesc()+" Alignment";
//    }
//
//    @Override
//    public double getCost() {
//        return this.getCost()+100;
//    }
}
