package ru.mirea.lab4;

public class Car implements Priceable {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "This car{" +
                "price=" + price +
                "$}";
    }
}