package edu.neu.csye7374;

public class StrategyBullMarket implements StrategyAPI{
    @Override
    public double sumOfInvestment() {
        System.out.println("sold Stock1 in BullMarket at high price to gain cash \n");
        return new FactoryStock1().getInstance().getPrice()*0.8*20000;
    }
}
