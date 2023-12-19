package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

public class StockEagerSingletonFactory extends StockSingletonFactory{
    private StockEagerSingletonFactory() {
    }
    public static final StockEagerSingletonFactory instance = new StockEagerSingletonFactory();


    public static StockEagerSingletonFactory getObject(){
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
