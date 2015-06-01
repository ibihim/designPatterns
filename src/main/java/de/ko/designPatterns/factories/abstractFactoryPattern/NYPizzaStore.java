package de.ko.designPatterns.factories.abstractFactoryPattern;

import de.ko.designPatterns.factories.abstractFactoryPattern.ingredients.PizzaIngredientFactory;
import de.ko.designPatterns.factories.abstractFactoryPattern.ingredients.nyStyle.NYPizzaIngredientFactory;
import de.ko.designPatterns.factories.abstractFactoryPattern.pizzas.*;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch(pizzaType) {
            case Cheese:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            case Veggie:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            case Clam:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
            case Pepperoni:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
