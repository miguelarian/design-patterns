package com.miguelvela;

public class DimDownCommand implements Command {
    private Light light;

    public DimDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.dimDown();
    }

    @Override
    public void undo() {
        this.light.dimUp();
    }
}
