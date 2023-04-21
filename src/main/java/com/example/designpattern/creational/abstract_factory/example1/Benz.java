package com.example.designpattern.creational.abstract_factory.example1;

public abstract class Benz {

    private String brand;
    private String type;

    public Benz() {
        this.brand = "Benz";
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
