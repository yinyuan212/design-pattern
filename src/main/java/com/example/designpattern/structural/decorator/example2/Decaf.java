package com.example.designpattern.structural.decorator.example2;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
