package com.example.designpattern.behavior.template_method;

public abstract class CaffeineBeverage {

    final void prepareDrink() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water.");
    }

    void pourInCup() {
        System.out.println("Pouring into water.");
    }

    boolean customerWantsCondiments() { // Hook，通常會是空的，可以由subClass決定要不要override
        return true;
    }

}
