package de.ko.designPatterns.commandPattern.commands;

import de.ko.designPatterns.commandPattern.Command;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.turnOff();
    }
}
