package de.ko.designPatterns.singleton;

public class VolatileSingleton {
    private static volatile VolatileSingleton uniqueInstance;

    private VolatileSingleton() {}

    public VolatileSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (VolatileSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new VolatileSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
