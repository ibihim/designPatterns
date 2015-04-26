package de.ko.designPatterns.decoratorPattern.starbuzz.Beverages;

public class Decaf extends Beverage {
    public Decaf() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
