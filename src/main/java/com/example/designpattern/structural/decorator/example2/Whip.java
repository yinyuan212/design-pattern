package com.example.designpattern.structural.decorator.example2;

public class Whip extends CondimentDecorator{

    private Beverage beverage;
    private String size;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Whip, " + beverage.getDescription();
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
