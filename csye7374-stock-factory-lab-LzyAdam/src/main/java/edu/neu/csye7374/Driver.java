package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SaiAkhil
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        //Add your code in between these two print statements
        StockMarket market = StockMarket.getInstance();
        StockFactory stockFactory1 = new Stock1Factory();
        //stockFactory1.name();
        Stock stock1 =  stockFactory1.getInstance();

        StockFactory stockFactory2 = new Stock2Factory();
        //stockFactory2.name();
        Stock stock2 = stockFactory2.getInstance();

        StockEagerSingletonFactory stockEagerSingletonFactory = StockEagerSingletonFactory.getObject();
        stockEagerSingletonFactory.getInstance();
        stockEagerSingletonFactory.name();

        StockLazySingletonFactory stockLazySingletonFactory = StockLazySingletonFactory.getObject();
        stockLazySingletonFactory.getInstance();
        stockLazySingletonFactory.name();



        // Adding stocks to the market
        market.addStock(stock1);
        market.addStock(stock2);

        // Simulating trading with 6 bids for each stock
        for (int i = 1; i <= 6; i++) {
            stock1.setBid(135.0 + i);
            stock2.setBid(155.0 - i);
        }

        // Showing all stocks in the market
        market.showAllStocks();
        System.out.println("\n\n============Main Execution End===================");
    }
}
