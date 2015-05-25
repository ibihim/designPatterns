package de.ko.designPatterns.factories.factoryMethodPattern;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");

        for (String topping : toppings) {
            System.out.println("\n" + topping);
        }
    }

    protected void bake() {
        System.out.println("Bake for 15 minutes at 250°C");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza into official Pizza Store Box");
    }

    public String getName() {
        return name;
    }
}
