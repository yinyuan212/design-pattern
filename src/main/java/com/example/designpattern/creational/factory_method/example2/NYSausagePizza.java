package com.example.designpattern.creational.factory_method.example2;

public class NYSausagePizza extends Pizza {
   String name = "NY Sausage pizze";
   String dough = "Thick";
   String sauce = "Marinara sauce";

    @Override
    void prepare() {
        System.out.println(name +" , " + dough + " , " + sauce);
    }
}
