package de.ko.designPatterns.decoratorPattern.starbuzz.Condiments;

import de.ko.designPatterns.decoratorPattern.starbuzz.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
