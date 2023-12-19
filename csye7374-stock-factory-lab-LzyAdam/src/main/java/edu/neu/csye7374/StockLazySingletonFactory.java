package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

public class StockLazySingletonFactory extends StockSingletonFactory{
    private StockLazySingletonFactory() {

    }
    private static volatile StockLazySingletonFactory instance =null;
    public static StockLazySingletonFactory getObject(){
        if (instance == null){
            synchronized (StockLazySingletonFactory.class) {
                instance = new StockLazySingletonFactory();
            }
        }
        return  instance;
    }
    public void name(){
        System.out.println("StockLazySingletonFactory create only one instance");
    }
    @Override
    public Stock1 getInstance() {
        return  new Stock1("IBM", 100.00, "IBM Common Stock",new ArrayList<>(Arrays.asList(100.38, 102.56, 104.39)),100);
    }
}
