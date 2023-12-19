package edu.neu.csye7374;

/**
 * @author SaiAkhil
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        BankAccount bankAccount = new BankAccount();
        //bankAccount.setRate(new FiveYearsSavingStrategy());

        //BankRateStrategyAPI ba = new FiveYearsSavingStrategy();
        bankAccount.setRate(new TenYearsSavingStrategy());
        bankAccount.totalInterest(100000000);

        //System.out.println("FiveYearsSavingStrategy"+bankAccount.calculateInterest(10000));
        //BankAccount bankAccount2 = new BankAccount();
        //bankAccount2.setRate(new FiveYearsSavingStrategy());
        //System.out.println("TenYearsSavingStrategy: "+bankAccount2.calculateInterest(20000));
//        BankAccount bankAccount3 = new BankAccount(100000,new OneYearSavingStrategy());
//        System.out.println("TenYearsSavingStrategy: "+bankAccount3.calculateInterest(10000));
        System.out.println("\n\n============Main Execution End===================");
        BankRateStrategyAPI bba = new FiveYearsSavingStrategy();


    }
}
