package de.ko.designPatterns.factories.factoryMethodPattern.chicagoStyle;

import de.ko.designPatterns.factories.factoryMethodPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
