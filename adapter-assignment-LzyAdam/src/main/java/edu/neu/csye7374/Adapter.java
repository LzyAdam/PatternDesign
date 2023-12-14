package edu.neu.csye7374;



public class Adapter extends Client implements LegacyAPI{


    public Adapter() {
    }

    @Override
    public void printFinalProfit(int stockAmount) {
        super.printFinalProfitExcludeTax(stockAmount);
    }
}
