package com.example.designpattern.creational.factory_method.example2;

public class PizzaClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");

        System.out.println("---------------");
        Pizza sausagePizza = pizzaStore.orderPizza("sausage");



    }

}
