package de.ko.designPatterns.commandPattern.commands;

import de.ko.designPatterns.commandPattern.Command;

public class CeillingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeillingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        switch (ceilingFan.getState()) {
            case 2:
                ceilingFan.setToHigh();
                break;
            case 1:
                ceilingFan.setToMedium();
                break;
            case 0:
                ceilingFan.setToLow();
        }
    }
}
