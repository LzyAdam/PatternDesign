package edu.neu.csye7374;

public class StrategyBearMarket implements StrategyAPI {
    @Override
    //buy 10000 Stock1 on 0.8 price
    public double sumOfInvestment() {
        System.out.println("buy Stock1 in BearMarket at low price and wait for the bull market to sell \n");
        return new FactoryStock1().getInstance().getPrice()*0.8*10000;
    }
}
