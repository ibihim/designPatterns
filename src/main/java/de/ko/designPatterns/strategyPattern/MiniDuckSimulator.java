package de.ko.designPatterns.strategyPattern;

import de.ko.designPatterns.strategyPattern.ducks.Duck;
import de.ko.designPatterns.strategyPattern.ducks.MallardDuck;
import de.ko.designPatterns.strategyPattern.ducks.ModelDuck;
import de.ko.designPatterns.strategyPattern.flyBehaviors.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
