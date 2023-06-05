package com.example.designpattern.creational.factory_method.example1;

public class Shirts implements Clothes{

    @Override
    public String getName() {

        System.out.println("This is a Shirts");
        return this.getClass().getSimpleName();
    }
}
