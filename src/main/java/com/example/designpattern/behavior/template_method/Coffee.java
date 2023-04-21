package com.example.designpattern.behavior.template_method;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew coffee.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add milk.");
    }
}
