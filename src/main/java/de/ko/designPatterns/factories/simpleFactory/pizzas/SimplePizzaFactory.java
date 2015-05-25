package de.ko.designPatterns.factories.simpleFactory.pizzas;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("chesse")) {
            pizza = new CheesePizza();
        }

        if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        if (type.equals("clam")) {
            pizza = new ClamPizza();
        }

        if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}