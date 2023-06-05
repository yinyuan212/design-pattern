package com.example.designpattern.behavior.command;

public class CommandClient {
    public static void main(String[] args) {

        // client負責建立command，並設定它的receiver
        Light light = new Light();  // new 出Receiver
        Command lightOnCommand = new LightOnCommand(light); // 把receiver放到Command中，

        // 把command放進invoker，由invoker執行execute()
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand); // Invoker setCommand
        simpleRemoteControl.buttonWasPressed();


        Command lightOffCommand = new LightOffCommand(light);
        AirConditioner airConditioner = new AirConditioner();
        Command airConditionerHighCommand = new AirConditionerHighCommand(airConditioner);
        Command airConditionerLowCommand = new AirConditionerLowCommand(airConditioner);

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl();

        advancedRemoteControl.setOnCommands(0, lightOnCommand, lightOffCommand);
        advancedRemoteControl.onCommandWasPressed(0);
        advancedRemoteControl.offCommandWasPressed(0);

        advancedRemoteControl.setOnCommands(1, airConditionerHighCommand, airConditionerLowCommand);
        advancedRemoteControl.onCommandWasPressed(1);
        advancedRemoteControl.offCommandWasPressed(1);

        advancedRemoteControl.offCommandWasPressed(2);


    }
}
