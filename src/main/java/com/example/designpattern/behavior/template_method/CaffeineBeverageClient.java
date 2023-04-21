package com.example.designpattern.behavior.template_method;

public class CaffeineBeverageClient {
    public static void main(String[] args) {

        System.out.println("I would like a cup of coffee.");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareDrink();

        System.out.println("");
        System.out.println("I would like a cup of no sugar tea.");
        CaffeineBeverage noSugarTea = new NoSugarTea();
        noSugarTea.prepareDrink();

    }

    /**
     * output:
     *
     * I would like a cup of coffee.
     * Boiling water.
     * Brew coffee.
     * Pouring into water.
     * Add milk.
     *
     * I would like a cup of no sugar tea.
     * Boiling water.
     * Brew no sugar tea.
     * Pouring into water.
     *
     */
}
