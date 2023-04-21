package com.example.designpattern.creational.abstract_factory.example2;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public String createDough() {
        System.out.println("nyDough");
        return "nyDough";
    }

    @Override
    public String createSauce() {
        System.out.println("nySauce");
        return "nySauce";
    }

    @Override
    public String createCheese() {
        System.out.println("nyCheese");
        return "nyCheese";
    }
}
