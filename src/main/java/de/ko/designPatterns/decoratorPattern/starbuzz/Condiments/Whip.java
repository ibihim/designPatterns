package de.ko.designPatterns.decoratorPattern.starbuzz.Condiments;

import de.ko.designPatterns.decoratorPattern.starbuzz.Beverages.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.1;
    }
}
