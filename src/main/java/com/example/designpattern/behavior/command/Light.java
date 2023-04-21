package com.example.designpattern.behavior.command;

public class Light { // 這是Receiver，

    public void on() { // 這是receiver的action()
        System.out.println("turn on the light.");
    }

    public void off() {
        System.out.println("turn off the light.");
    }
}
