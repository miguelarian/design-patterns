package com.miguelvela;

import java.util.Optional;

public class RemoteControl {

    private Command turnOn;
    private Command turnOff;
    private Command dimUp;
    private Command dimDown;
    private CommandHistory commandHistory;

    public RemoteControl(Command turnOn, Command turnOff, Command dimUp, Command dimDown) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.dimUp = dimUp;
        this.dimDown = dimDown;
        this.commandHistory = new CommandHistory();
    }

    public void turnOn() {
        System.out.println("Turning on the lights");
        this.turnOn.execute();
        this.commandHistory.push(this.turnOn);
    }

    public void turnOff() {
        System.out.println("Turning off the lights");
        this.turnOff.execute();
        this.commandHistory.push(this.turnOff);
    }

    public void dimUp() {
        System.out.println("Dimming up the lights");
        this.dimUp.execute();
        this.commandHistory.push(this.dimUp);
    }

    public void dimDown() {
        System.out.println("Dimming down the lights");
        this.dimDown.execute();
        this.commandHistory.push(this.dimDown);
    }

    public void undo() {
        Optional<Command> undoneCommand = this.commandHistory.pop();

        undoneCommand.ifPresent(command -> {
            System.out.println("Undoing the last command: " + command.getClass().getSimpleName());
            command.undo();
        });

        System.out.println("Nothing to undo");
    }
}
