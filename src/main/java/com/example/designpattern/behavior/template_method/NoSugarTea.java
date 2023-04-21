package com.example.designpattern.behavior.template_method;

public class NoSugarTea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew no sugar tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Don't add condiments.");
    }

    @Override
    boolean customerWantsCondiments() {
        return false;
    }
}
