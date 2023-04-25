package com.example.designpattern.behavior.iterator;

public class MenuItem {
    String name;
    Integer price;

    public MenuItem(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
