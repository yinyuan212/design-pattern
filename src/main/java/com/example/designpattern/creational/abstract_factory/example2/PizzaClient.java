package com.example.designpattern.creational.abstract_factory.example2;

public class PizzaClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");





    }

}
