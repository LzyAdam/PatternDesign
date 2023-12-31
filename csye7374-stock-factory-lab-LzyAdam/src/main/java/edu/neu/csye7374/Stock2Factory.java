package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

public class Stock2Factory extends StockFactory{
    @Override
    public void name() {
        System.out.println("I am Stock2Factory");
    }

    @Override
    public Stock2 getInstance() {
        return  new Stock2("AAPL", 200.00, "Apple Inc. Common Stock",new ArrayList<>(Arrays.asList(200.38, 202.56, 204.38)),500);
    }
}
