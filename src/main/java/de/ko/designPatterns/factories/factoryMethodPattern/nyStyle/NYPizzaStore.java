package de.ko.designPatterns.factories.factoryMethodPattern.nyStyle;

import de.ko.designPatterns.factories.factoryMethodPattern.*;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if (type == PizzaType.Cheese) {
            pizza = new NYStyleCheesePizza();
        }

        if (type == PizzaType.Clam) {
            pizza = new NYStyleClamPizza();
        }

        if (type == PizzaType.Veggie) {
            pizza = new NYStyleVeggiePizza();
        }

        if (type == PizzaType.Pepperoni) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
