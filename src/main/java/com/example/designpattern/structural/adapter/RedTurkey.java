package com.example.designpattern.structural.adapter;

public class RedTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("red turkey gobble.");
    }

    @Override
    public void fly() {
        System.out.println("red turkey fly.");
    }
}
