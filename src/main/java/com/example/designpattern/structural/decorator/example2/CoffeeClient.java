package com.example.designpattern.structural.decorator.example2;

public class CoffeeClient {
    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso.setSize("small");
        Beverage mocha = new Mocha(espresso);
        Beverage soy = new Soy(mocha);
        Beverage whip = new Whip(soy);

        System.out.println(String.format("total cost: %s, ingredients: %s, size: %s", whip.cost(), whip.getDescription(), whip.getSize()));






    }
}
