package com.example.designpattern.structural.decorator.example2;

public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Soy, " + beverage.getDescription();
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if("small".equals(getSize())) {
            cost += 0.1;
        } else if ("medium".equals(getSize())) {
            cost += 0.15;
        } else if ("large".equals(getSize())) {
            cost += 0.2;
        }

        return cost;

    }


}
