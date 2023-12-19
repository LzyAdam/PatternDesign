package com.extend;

public class Diagnostic extends RepairBill implements RepairProcedureAPI{
    private RepairBill repairBill;

    public Diagnostic(RepairBill repairBill) {
        this.repairBill = repairBill;
    }

    @Override
    public String getCode() {
        return super.getCode()+"90";
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"Diagnostic";
    }

    @Override
    public double getCost() {
        return repairBill.getCost()+199;
    }
}
