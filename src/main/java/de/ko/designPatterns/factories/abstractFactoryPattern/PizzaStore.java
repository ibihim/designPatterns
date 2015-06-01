package de.ko.designPatterns.factories.abstractFactoryPattern;

import de.ko.designPatterns.factories.abstractFactoryPattern.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
