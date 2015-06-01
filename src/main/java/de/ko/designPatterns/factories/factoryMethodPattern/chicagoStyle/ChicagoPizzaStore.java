package de.ko.designPatterns.factories.factoryMethodPattern.chicagoStyle;

import de.ko.designPatterns.factories.factoryMethodPattern.Pizza;
import de.ko.designPatterns.factories.factoryMethodPattern.PizzaStore;
import de.ko.designPatterns.factories.factoryMethodPattern.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        if (type == PizzaType.Cheese) {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
