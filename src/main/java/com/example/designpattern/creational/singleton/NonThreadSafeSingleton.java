package com.example.designpattern.creational.singleton;

public class NonThreadSafeSingleton {

    private static NonThreadSafeSingleton instance;

    private String state;

    private NonThreadSafeSingleton() {
    }

    public static NonThreadSafeSingleton getInstance(String state) {

        if(instance == null){
            instance = new NonThreadSafeSingleton();
            instance.state = state;
        }

        return instance;
    };

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Singleton [").append("state=").append(state);
        builder.append("]");
        return builder.toString();
    }
}
