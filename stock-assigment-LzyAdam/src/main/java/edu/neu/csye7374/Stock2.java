package edu.neu.csye7374;

import java.util.List;

public class Stock2 extends Stock {
    public Stock2(String name, double price, String description, List<Double> bids, int metric) {
        super(name, price, description, bids, metric);
    }
    //    private String name;
//    private double price;
//    private String description;
//    private List<Double> bids;
//    private int metric;
//
//    public Stock2() {
//    }
//
//    public Stock2(String name, double price, String description) {
//        this.name = name;
//        this.price = price;
//        this.description = description;
//    }
//
//    public Stock2(String name, double price, String description, List<Double> bids, int metric) {
//        this.name = name;
//        this.price = price;
//        this.description = description;
//        this.bids = bids;
//        this.metric = metric;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public List<Double> getBids() {
//        return bids;
//    }
//
//    public void setBids(List<Double> bids) {
//        this.bids = bids;
//    }
//
//    @Override
//    public void setBid(double bid) {
//        bids.add(bid);
//        calculateNewPrice();
//        calculateMetric();
//    }
//    private void calculateNewPrice() {
//        if (!bids.isEmpty()) {
//            double totalBids = 0;
//            for (double bid : bids) {
//                totalBids += bid;
//            }
//            price = totalBids / bids.size();
//        }
//    }
//    private void calculateMetric() {
//        // You can implement your own logic for calculating the metric here
//        // For demonstration purposes, we'll use a simple metric based on bid averages
//        if (!bids.isEmpty()) {
//            double bidSum = 0;
//            for (double bid : bids) {
//                bidSum += bid;
//            }
//            double averageBid = bidSum / bids.size();
//            metric = (int) ((price - averageBid) * 100); // Example metric calculation
//        }
//    }
//
//    @Override
//    public int getMetric() {
//        return metric;
//    }
//
//
//    public void setMetric(int metric) {
//        this.metric = metric;
//    }
//    @Override
//    public String toString() {
//        return "Stock{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", description='" + description + '\'' +
//                '}';
//    }



}