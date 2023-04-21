package com.example.designpattern.creational.factory_method.example2;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        } else if ("sausage".equals(type)) {
            pizza = new NYSausagePizza();
        }

        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
