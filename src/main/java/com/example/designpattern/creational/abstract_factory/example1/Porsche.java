package com.example.designpattern.creational.abstract_factory.example1;

public abstract class Porsche {

    private String brand;
    private String type;

    public Porsche() {
        this.brand = "Porsche";
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
