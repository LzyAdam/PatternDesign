package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private static StockMarket instance;
    private List<Stock> stocks;

    private StockMarket() {
        stocks = new ArrayList<Stock>();
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }


    public void removeStock(Stock1 stock) {
        stocks.remove(stock);
    }

    public void showAllStocks() {
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }




}
