package de.ko.designPatterns.strategyPattern.flyBehaviors;

public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
