package com.example.designpattern.behavior.command;

public class AirConditionerLowCommand implements Command {

    AirConditioner airConditioner;

    public AirConditionerLowCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.lower();
    }
}
