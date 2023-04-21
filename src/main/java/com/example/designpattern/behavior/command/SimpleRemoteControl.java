package com.example.designpattern.behavior.command;

public class SimpleRemoteControl { // 這是Invoker，有Command跟setCommand()，下面有一個方法buttonWasPressed()，用來呼叫command的execute()
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
