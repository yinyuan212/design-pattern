package com.example.designpattern.structural.adapter;

public class GreenDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("green duck quack quack");
    }

    @Override
    public void fly() {
        System.out.println("green duck fly");
    }
}
