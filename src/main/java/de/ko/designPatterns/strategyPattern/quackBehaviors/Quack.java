package de.ko.designPatterns.strategyPattern.quackBehaviors;

public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }
}
