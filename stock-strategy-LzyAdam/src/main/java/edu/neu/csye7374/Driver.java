package edu.neu.csye7374;

/**
 * @author SaiAkhil
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");



    System.out.println("\n====this is the usage of the Strategy pattern1:StrategyBullMarket===\n");
    StrategyManager strategyManager = new StrategyManager();
    strategyManager.setStrategy(new StrategyBullMarket());
    System.out.println(strategyManager.companyInvestment());
    System.out.println("\n====this is the usage of the Strategy pattern1:StrategyBullMarket===\n");

    System.out.println("\n====this is the usage of the Strategy pattern2:StrategyBearMarket===\n");
    StrategyManager strategyManager2 = new StrategyManager();
    strategyManager2.setStrategy(new StrategyBearMarket());
    System.out.println(strategyManager2.companyInvestment());
    System.out.println("\n====this is the usage of the Strategy pattern2:StrategyBearMarket===\n");

    System.out.println("\n====this is the usage of the Strategy pattern3:StrategyBearMarketSingleton===\n");
    StrategyManager strategyManager3 = new StrategyManager();
    strategyManager3.setStrategy(StrategyBearMarketSingleton.getInstance());
    System.out.println(strategyManager3.companyInvestment());
    System.out.println("\n====this is the usage of the Strategy pattern3:StrategyBearMarketSingleton===\n");

    System.out.println("\n====this is the usage of the Strategy pattern4:StrategyBullMarketSingleton===\n");

    StrategyManager strategyManager4 = new StrategyManager();
    strategyManager4.setStrategy(StrategyBullMarketSingleton.getInstance());
    System.out.println(strategyManager4.companyInvestment());
    System.out.println("\n====this is the usage of the Strategy pattern4:StrategyBullMarketSingleton===\n");







//        //Add your code in between these two print statements
//        MarketStock market = MarketStock.getInstance();
//        FactoryStock stockFactory1 = new FactoryStock1();
//        //stockFactory1.name();
//        Stock stock1 =  stockFactory1.getInstance();
//
//        FactoryStock stockFactory2 = new FactoryStock2();
//        //stockFactory2.name();
//        Stock stock2 = stockFactory2.getInstance();
//
//        FactoryStockEagerSingleton stockEagerSingletonFactory = FactoryStockEagerSingleton.getObject();
//        stockEagerSingletonFactory.getInstance();
//        stockEagerSingletonFactory.name();
//
//        FactoryStockLazySingleton stockLazySingletonFactory = FactoryStockLazySingleton.getObject();
//        stockLazySingletonFactory.getInstance();
//        stockLazySingletonFactory.name();
//
//
//
//        // Adding stocks to the market
//        market.addStock(stock1);
//        market.addStock(stock2);
//
//        // Simulating trading with 6 bids for each stock
//        for (int i = 1; i <= 6; i++) {
//            stock1.setBid(135.0 + i);
//            stock2.setBid(155.0 - i);
//        }
//
//        // Showing all stocks in the market
//        market.showAllStocks();

        System.out.println("\n\n============Main Execution End===================");
    }
}
