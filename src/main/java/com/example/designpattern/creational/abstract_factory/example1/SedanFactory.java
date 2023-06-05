package com.example.designpattern.creational.abstract_factory.example1;

public class SedanFactory extends CarFactory{

    @Override
    public Benz createBenz() {
        return new BenzSedan();
    }

    @Override
    public Porsche createPorsche() {
        return new PorscheSedan();
    }
}
