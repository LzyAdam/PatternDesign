package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

public class FactoryStock1 extends FactoryStock {
    @Override
    public void name() {
        System.out.println("I am Stock1Factory");
    }

    @Override
    public Stock1 getInstance() {
        return  new Stock1("IBM", 100.00, "IBM Common Stock",new ArrayList<>(Arrays.asList(100.38, 102.56, 104.39)),100);
    }
}
