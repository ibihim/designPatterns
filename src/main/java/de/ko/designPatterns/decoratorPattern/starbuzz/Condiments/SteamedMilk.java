package de.ko.designPatterns.decoratorPattern.starbuzz.Condiments;

import de.ko.designPatterns.decoratorPattern.starbuzz.Beverages.Beverage;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", steamed milk";
    }

    public double cost() {
        return beverage.cost() + 0.1;
    }
}
