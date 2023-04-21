package com.example.designpattern.creational.factory_method.example2;

public class NYCheesePizza extends Pizza {

    String name = "NYCheesePizza";
    String dough = "dddd";
    String sauce = "cheese sauce";

    @Override
    void prepare() {
        System.out.println(name +" , " + dough + " , " + sauce);
    }

}
