package com.example.designpattern.creational.factory_method.example1;

public class JacketFactory implements ClothFactory {

    @Override
    public Clothes getProduct() {
        return new Jacket();
    }
}
