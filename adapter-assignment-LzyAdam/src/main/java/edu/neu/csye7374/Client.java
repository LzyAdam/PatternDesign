package edu.neu.csye7374;

public class Client implements ClientAPI{
    @Override
    public void printFinalProfitExcludeTax(int stockAmount) {
        System.out.println("sold "+stockAmount+" IBM " +" the profit after tax is: ");
        System.out.println(new FactoryStock1().getInstance().getPrice()*stockAmount*0.8);
    }
}
