package org.gregm.pizza;

public class Pizza {
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

