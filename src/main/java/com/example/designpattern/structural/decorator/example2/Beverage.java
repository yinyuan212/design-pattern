package com.example.designpattern.structural.decorator.example2;

public abstract class Beverage {

    String description = "Unknown beverage";
    String size = "medium";
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
