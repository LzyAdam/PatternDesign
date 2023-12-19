package edu.neu.csye7374;

public class TenYearsSavingStrategy implements BankRateStrategyAPI{
    public static final double Ten_YEAR_RATE = 0.0575;
    @Override

    public double calculateInterest(double deposit) {
        System.out.println("Dear Customer welcome to use BOA Bank Service ");
        double interest = deposit*Ten_YEAR_RATE;
        System.out.println("Dear Customer your interest is: "+interest);
        return interest;
    }
}
