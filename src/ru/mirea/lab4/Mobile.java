package ru.mirea.lab4;

public class Mobile implements Priceable {
    private double price;

    public Mobile(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "This mobile{" +
                "price=" + price +
                "$}";
    }
}