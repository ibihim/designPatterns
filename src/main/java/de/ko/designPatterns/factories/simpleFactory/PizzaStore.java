package de.ko.designPatterns.factories.simpleFactory;

import de.ko.designPatterns.factories.simpleFactory.pizzas.Pizza;
import de.ko.designPatterns.factories.simpleFactory.pizzas.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
