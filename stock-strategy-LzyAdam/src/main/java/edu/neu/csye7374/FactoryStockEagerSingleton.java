package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

public class FactoryStockEagerSingleton extends FactoryStockSingleton {
    private FactoryStockEagerSingleton() {
    }
    public static final FactoryStockEagerSingleton instance = new FactoryStockEagerSingleton();


    public static FactoryStockEagerSingleton getObject(){
        return instance;
    }

    public void name(){
        System.out.println("StockEagerSingletonFactory create only one instance");
    }
    @Override
    public Stock1 getInstance() {
        return new Stock1("AAPL", 200.00, "Apple Inc. Common Stock",new ArrayList<>(Arrays.asList(200.38, 202.56, 204.38)),500);
    }
}
