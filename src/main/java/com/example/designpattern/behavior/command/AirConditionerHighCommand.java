package com.example.designpattern.behavior.command;

public class AirConditionerHighCommand implements Command {


    AirConditioner airConditioner;

    public AirConditionerHighCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.higher();
    }
}
