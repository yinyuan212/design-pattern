package com.example.designpattern.creational.abstract_factory.example1;

public class SuvFactory extends CarFactory{

    @Override
    public Benz createBenz(){
        return new BenzSuv();
    }

    @Override
    public Porsche createPorsche() {
        return new PorscheSuv();
    }

}
