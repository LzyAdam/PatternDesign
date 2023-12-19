package edu.neu.csye7374;

public class BankAccount {
    private double deposit;
     BankRateStrategyAPI rate;





    public BankAccount() {
    }

//    public BankAccount(double deposit) {
//        this.deposit = deposit;
//    }
//    public BankAccount( BankRateStrategyAPI rate) {
//
//        this.rate = rate;
//    }
//
//    public BankAccount(double deposit, BankRateStrategyAPI rate) {
//        this.deposit = deposit;
//        this.rate = rate;
//    }

//    public double getDeposit() {
//        return deposit;
//    }
//
//    public void setDeposit(double deposit) {
//        this.deposit = deposit;
//    }

//    public BankRateStrategyAPI getRate() {
//        return rate;
//    }

    public void setRate(BankRateStrategyAPI rate1) {
        this.rate = rate1;
    }

//    public  double totalInterest(double deposit,BankRateStrategyAPI rate){
//        return rate.calculateInterest(deposit);
//    }
//    public  double totalInterest(double deposit,BankRateStrategyAPI rate){
//        return rate.calculateInterest(deposit);
//    }

    public  double totalInterest(double deposit){


        return rate.calculateInterest(deposit);
    }


}
