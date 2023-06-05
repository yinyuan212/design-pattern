package com.example.designpattern.creational.factory_method.example1;

public class Jacket implements Clothes{

    @Override
    public String getName() {
        System.out.println("This is a jacket.");
        return this.getClass().getSimpleName();
    }
}
