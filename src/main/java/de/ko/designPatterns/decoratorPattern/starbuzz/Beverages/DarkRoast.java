package de.ko.designPatterns.decoratorPattern.starbuzz.Beverages;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return 1.99;
    }
}
