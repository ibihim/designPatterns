package de.ko.designPatterns.commandPattern.commands;

import de.ko.designPatterns.commandPattern.Command;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
