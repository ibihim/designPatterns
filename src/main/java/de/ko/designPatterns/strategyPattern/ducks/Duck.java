package de.ko.designPatterns.strategyPattern.ducks;

import de.ko.designPatterns.strategyPattern.flyBehaviors.FlyBehavior;
import de.ko.designPatterns.strategyPattern.quackBehaviors.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All duck swim, even decoys!");
    }
}
