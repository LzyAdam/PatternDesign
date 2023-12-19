package com.Decorator.dec1;

public class Pancake {
    private double price=5;
    private String description="pancake";

    public Pancake() {
    }

    public Pancake(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pancake{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
