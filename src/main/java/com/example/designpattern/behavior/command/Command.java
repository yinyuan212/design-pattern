package com.example.designpattern.behavior.command;

public interface Command { // 這是command，要有一個execute()，ConcreteCommand把要做的指令寫在execute()
    void execute();

    // void undo(); 若再加入undo等方法，例如在LightOnCommand的@overrde的undo()，就要呼叫light.off()
}
