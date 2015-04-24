package de.ko.designPatterns.strategyPattern.ducks;

import de.ko.designPatterns.strategyPattern.flyBehaviors.FlyWithWings;
import de.ko.designPatterns.strategyPattern.quackBehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.print("I am a real Mallard duck!");
    }
}
