package com.extend;

public class RepairBill implements RepairProcedureAPI{
    private String code=" ";
    private String desc=" ";
    private double cost=0.0;

    public RepairBill() {
    }

//    public RepairBill(String code, String desc, double cost) {
//        this.code = code;
//        this.desc = desc;
//        this.cost = cost;
//    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
