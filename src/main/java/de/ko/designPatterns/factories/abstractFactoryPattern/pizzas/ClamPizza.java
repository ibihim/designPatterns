package de.ko.designPatterns.factories.abstractFactoryPattern.pizzas;

import de.ko.designPatterns.factories.abstractFactoryPattern.ingredients.PizzaIngredientFactory;
import de.ko.designPatterns.factories.abstractFactoryPattern.ingredients.Clams;


public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    Clams clam;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClams();
    }
}
