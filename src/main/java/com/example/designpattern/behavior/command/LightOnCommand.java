package com.example.designpattern.behavior.command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) { // 在ConcreteCommand中放入Receiver，並在execute()呼叫receiver的action()
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
