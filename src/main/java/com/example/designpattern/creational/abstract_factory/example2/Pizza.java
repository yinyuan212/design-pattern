package com.example.designpattern.creational.abstract_factory.example2;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    abstract void prepare(); // abstract factory: 這邊做成抽象，由實體物件來實作，並放入原料工廠


    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
