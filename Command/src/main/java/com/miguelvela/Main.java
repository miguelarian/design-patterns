package com.miguelvela;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);
        Command dimUp = new DimUpCommand(light);
        Command dimDown = new DimDownCommand(light);
        RemoteControl remoteControl = new RemoteControl(turnOn, turnOff, dimUp, dimDown);

        remoteControl.turnOn();
        remoteControl.dimDown();
        remoteControl.dimDown();
        remoteControl.dimDown();
        remoteControl.dimUp();
        remoteControl.dimUp();
        remoteControl.dimUp();
        remoteControl.turnOff();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
    }
}