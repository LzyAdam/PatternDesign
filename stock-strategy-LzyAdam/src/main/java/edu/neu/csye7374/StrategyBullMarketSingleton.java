package edu.neu.csye7374;

public class StrategyBullMarketSingleton implements StrategyAPI {
    private static final StrategyBullMarketSingleton instance = new StrategyBullMarketSingleton();
    private StrategyBullMarketSingleton(){

    }
    public static StrategyBullMarketSingleton getInstance(){
        return instance;
    }



    @Override
    public double sumOfInvestment() {
        System.out.println("sold Stock2 in BearMarket at low price and wait for the bull market to sell \n");
        return new FactoryStock2().getInstance().getPrice()*0.8*20000;
    }
}
