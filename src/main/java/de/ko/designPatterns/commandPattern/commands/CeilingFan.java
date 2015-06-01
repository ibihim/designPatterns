package de.ko.designPatterns.commandPattern.commands;

public class CeilingFan {
    static final int HIGH = 3;
    static final int MEDIUM = 2;
    static final int LOW = 1;

    int state;

    public void setToHigh() {
        state = HIGH;
        System.out.println("Fan on high");
    }

    public void setToMedium() {
        state = MEDIUM;
        System.out.println("Fan on medium");
    }

    public void setToLow() {
        state = LOW;
        System.out.println("Fan on low");
    }

    public void turnOff() {
        state = 0;
        System.out.println("Fan on off");
    }

    public int getState() {
        return state;
    }

}
