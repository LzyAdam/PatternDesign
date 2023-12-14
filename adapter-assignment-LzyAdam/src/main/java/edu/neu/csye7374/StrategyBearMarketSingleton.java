package edu.neu.csye7374;

public class StrategyBearMarketSingleton implements StrategyAPI {

    private static final StrategyBearMarketSingleton instance = new StrategyBearMarketSingleton();
    private StrategyBearMarketSingleton() {
    }
    public static StrategyBearMarketSingleton getInstance(){
        return instance;
    }


    @Override
    public double sumOfInvestment() {
        System.out.println("buy Stock2 in BearMarket at low price and wait for the bull market to sell \n");
        return new FactoryStock2().getInstance().getPrice()*0.8*10000;
    }
}
