package de.ko.designPatterns.decoratorPattern.starbuzz.Condiments;

import de.ko.designPatterns.decoratorPattern.starbuzz.Beverages.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return this.beverage.cost() + 0.15;
    }
}
