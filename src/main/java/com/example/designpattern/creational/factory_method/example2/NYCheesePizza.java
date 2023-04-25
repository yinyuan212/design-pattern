package com.example.designpattern.creational.factory_method.example2;

public class NYCheesePizza extends Pizza {

    String name = "NYCheesePizza";
    String dough = "crispy";
    String sauce = "cheese sauce";

    @Override
    void prepare() {
        System.out.println("Amazing~~~ " + name +" , " + dough + " , " + sauce);
    }
    void bake() {
        System.out.println("Bake for 15 minutes at 400");
    }
    void cut() {
        System.out.println("Cutting pizza into 8 slices");
    }

}
