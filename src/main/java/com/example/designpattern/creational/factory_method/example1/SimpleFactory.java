package com.example.designpattern.creational.factory_method.example1;

public class SimpleFactory {

    public static ClothFactory createFactory(String clothType) {
        switch(clothType) {
            case "jacket":
                return new JacketFactory();
            case "shirts":
                return new ShirtsFactory();

            default:
                return new ShirtsFactory();
        }
    }
}
