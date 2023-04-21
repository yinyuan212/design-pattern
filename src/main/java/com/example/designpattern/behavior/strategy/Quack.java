package com.example.designpattern.behavior.strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack quack quack");
    }
}
