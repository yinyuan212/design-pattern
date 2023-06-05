package com.example.designpattern.creational.abstract_factory.example2;

public class CheesePizza extends Pizza { // abstract factory: 由NYCheesePizza 改為 CheesePizza，地區由原來來決定
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        name = pizzaIngredientFactory.createDough();
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }

}
