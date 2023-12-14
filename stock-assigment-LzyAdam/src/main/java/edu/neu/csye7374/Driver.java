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
//        double arr[] = { 1.2, 2.3, 3.4, 4.5, 5.6 };
//        List<Double> myList = Doubles.asList(arr);
        // Adding two unique Stock subclasses
        Stock stock1 = new Stock1("IBM", 100.00, "IBM Common Stock",new ArrayList<>(Arrays.asList(100.38, 102.56, 104.39)),100);
        Stock stock2 = new Stock2("AAPL", 200.00, "Apple Inc. Common Stock",new ArrayList<>(Arrays.asList(200.38, 202.56, 204.38)),500);
        //Stock stock3 = new Stock3("IBM", 100.00, "IBM Common Stock",new ArrayList<>(Arrays.asList(100.38, 102.56, 104.39)),100);
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
