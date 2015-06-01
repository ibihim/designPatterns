package de.ko.designPatterns.commandPattern.commands;

public class Stereo {
    public void on() {
        System.out.println("Turning stereo on");
    }

    public void off() {
        System.out.println("Turning stereo off");
    }

    public void setCd() {
        System.out.println("Starting CD...");
    }

    public void setDvd() {
        System.out.println("Starting DVD...");
    }

    public void setRadio() {
        System.out.println("Starting Radio...");
    }

    public void setVolume(int volume) {
        System.out.println("Setting Volume to " + volume);
    }
}
