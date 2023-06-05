package com.example.designpattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class AdvancedRemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public AdvancedRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand= new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setOnCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot]= onCommand;
        offCommands[slot]= offCommand;
    }

    public void onCommandWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offCommandWasPressed(int slot) {
        offCommands[slot].execute();
    }
}
