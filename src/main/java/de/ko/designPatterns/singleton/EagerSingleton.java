package de.ko.designPatterns.singleton;

public class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {}

    public EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
