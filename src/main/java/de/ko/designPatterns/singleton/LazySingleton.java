package de.ko.designPatterns.singleton;

public class LazySingleton {
    private static LazySingleton uniqueInstance;

    private LazySingleton() {}

    // to avoid several LazySingleton instances on race condition
    public static synchronized LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }

        return uniqueInstance;
    }
}
