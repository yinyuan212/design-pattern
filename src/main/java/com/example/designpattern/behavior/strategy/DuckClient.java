package com.example.designpattern.behavior.strategy;

public class DuckClient {


    public static void main(String[] args) {

        Duck duck = new GreenDuck();

        duck.setFlyBehavior(new FlyWithWings()); // strategy pattern
        duck.setQuackBehavior(new Quack());      // strategy pattern
        duck.swim();
        duck.performFly();
        duck.performQuack();
        duck.display();
    }
}
