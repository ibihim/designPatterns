package de.ko.designPatterns.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    List<Command> onCommands = new ArrayList<Command>();
    List<Command> offCommands = new ArrayList<Command>();

    public void addCommand(Command onCommand, Command offCommand) {
        this.onCommands.add(onCommand);
        this.offCommands.add(offCommand);
    }

    public void onButtonWasPushed(int slot) {
        if (slot < onCommands.size() && onCommands.get(slot) != null){
            onCommands.get(slot).execute();
        } else {
            System.err.println("empty slot");
        }
    }

    public void offButtonWasPushed(int slot) {
        if (slot < offCommands.size() && offCommands.get(slot) != null) {
            offCommands.get(slot).execute();
        } else {
            System.err.println("empty slot");
        }
    }

    public String toString() {
        int lengthOfShorter;
        String type;
        List<Command> longerOne;

        if (onCommands.size() <= offCommands.size()) {
            lengthOfShorter = onCommands.size();
            longerOne = offCommands;
            type = "ofCommand";
        } else {
            lengthOfShorter = offCommands.size();
            longerOne = onCommands;
            type = "onCommand";
        }

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---- Remote Control ----\n");

        for (int i = 0; i < lengthOfShorter; i++) {
            stringBuffer.append("slot " + i + ": ");
            stringBuffer.append(onCommands.get(i).getClass().getSimpleName() + " (onCommand)\t ");
            stringBuffer.append(offCommands.get(i).getClass().getSimpleName() + " (offCommand)\n");
        }


        for (int i = lengthOfShorter; i < longerOne.size(); i++) {
            stringBuffer.append("slot " + i + ": ");
            stringBuffer.append(onCommands.get(i).getClass().getSimpleName() + " (" + type + ")\n ");
        }

        return stringBuffer.toString();
    }
}
