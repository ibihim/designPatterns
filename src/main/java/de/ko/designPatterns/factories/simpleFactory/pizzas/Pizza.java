package de.ko.designPatterns.factories.simpleFactory.pizzas;

public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}
