package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

public class FactoryStockLazySingleton extends FactoryStockSingleton {
    private FactoryStockLazySingleton() {

    }
    private static volatile FactoryStockLazySingleton instance =null;
    public static FactoryStockLazySingleton getObject(){
        if (instance == null){
            synchronized (FactoryStockLazySingleton.class) {
                instance = new FactoryStockLazySingleton();
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
