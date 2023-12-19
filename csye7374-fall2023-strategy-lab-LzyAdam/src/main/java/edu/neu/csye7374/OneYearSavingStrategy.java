package edu.neu.csye7374;

public class OneYearSavingStrategy implements BankRateStrategyAPI{
    public static final double One_YEAR_RATE = 0.0189;
    @Override

    public double calculateInterest(double deposit) {
        System.out.println("Dear Customer welcome to use BOA Bank Service ");
        double interest = deposit*One_YEAR_RATE;
        System.out.println("Dear Customer your interest is: "+interest);
        return interest;
    }
}
