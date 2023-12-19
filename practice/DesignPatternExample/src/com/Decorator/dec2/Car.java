package com.Decorator.dec2;

public class Car {
    private int price=50000;
    private String desc="BMW";

    public Car() {
    }

    public Car(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
