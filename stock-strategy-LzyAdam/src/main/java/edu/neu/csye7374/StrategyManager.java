package edu.neu.csye7374;

public class StrategyManager {
    private StrategyAPI strategy;

    public void setStrategy(StrategyAPI strategy) {
        this.strategy = strategy;
    }

    public double companyInvestment(){
        return strategy.sumOfInvestment();
    }



}
