package de.ko.designPatterns.factories.factoryMethodPattern;

import de.ko.designPatterns.factories.factoryMethodPattern.chicagoStyle.ChicagoPizzaStore;
import de.ko.designPatterns.factories.factoryMethodPattern.nyStyle.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza(PizzaType.Cheese);
        System.out.println("Hermann ordered a " + nyPizza.getName() + "\n");

        Pizza chicagoPizza = chicagoStore.orderPizza(PizzaType.Cheese);
        System.out.println("Julian ordered a " + chicagoPizza.getName() + "\n");
    }
}
