package com.example.designpattern.creational.abstract_factory.example2;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {
            pizza = new CheesePizza(new NYPizzaIngredientFactory());
        } else if ("sausage".equals(type)) {
//            pizza = new NYSausagePizza();
        }

        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
