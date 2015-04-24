package de.ko.designPatterns.strategyPattern.quackBehaviors;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<<Silence>>");
    }
}
