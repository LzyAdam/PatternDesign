package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class MarketStock {
    private static MarketStock instance;
    private List<Stock> stocks;

    private MarketStock() {
        stocks = new ArrayList<Stock>();
    }

    public static MarketStock getInstance() {
        if (instance == null) {
            instance = new MarketStock();
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
