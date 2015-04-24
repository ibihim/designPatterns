package de.ko.designPatterns.strategyPattern.flyBehaviors;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly");
    }
}
