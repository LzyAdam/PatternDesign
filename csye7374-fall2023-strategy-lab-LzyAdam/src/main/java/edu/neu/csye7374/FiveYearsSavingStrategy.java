package edu.neu.csye7374;

public class FiveYearsSavingStrategy implements BankRateStrategyAPI{
    public static final double Five_YEAR_RATE = 0.035;
    int i=5;
    public FiveYearsSavingStrategy() {
        System.out.println("FiveYearsSavingStrategy created>>>>>>");
    }
    public void call(){
        System.out.println("this method call FiveYearsSavingStrategy---->");
    }
    @Override
    public double calculateInterest(double deposit) {
        //System.out.println("Dear Customer welcome to use BOA Bank Service ");
        double interest = deposit*Five_YEAR_RATE;
        System.out.println("Dear Customer your interest is: "+interest);
        return interest;
    }
}
