package com.example.designpattern.creational.singleton;

public class EagerInitializationSingleton {

    private static EagerInitializationSingleton instance = new EagerInitializationSingleton("active");

    private String state;

    private EagerInitializationSingleton(String state) {
        this.state = state;
    }

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }

    public String getState() {
        return state;
    }
}
