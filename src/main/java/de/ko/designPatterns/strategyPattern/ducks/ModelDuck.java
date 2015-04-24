package de.ko.designPatterns.strategyPattern.ducks;

import de.ko.designPatterns.strategyPattern.flyBehaviors.FlyNoWay;
import de.ko.designPatterns.strategyPattern.quackBehaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
