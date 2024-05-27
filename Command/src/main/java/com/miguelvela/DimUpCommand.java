package com.miguelvela;

public class DimUpCommand implements Command {
    private Light light;

    public DimUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.dimUp();
    }

    @Override
    public void undo() {
        this.light.dimDown();
    }
}
