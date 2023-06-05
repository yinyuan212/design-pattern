package com.example.designpattern.creational.factory_method.example2;

public class PizzaClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");

        System.out.println("---------------");
        Pizza sausagePizza = pizzaStore.orderPizza("sausage");
    }

    /*
        output:

        NYCheesePizza , crispy , cheese sauce
        Bake for 25 minutes at 350
        Cutting pizza into diagonal slices
        Place pizza in official PizzaStore box
        ---------------
        NY Sausage pizze , Thick , Marinara sauce
        Bake for 25 minutes at 350
        Cutting pizza into diagonal slices
        Place pizza in official PizzaStore box
     */
}
