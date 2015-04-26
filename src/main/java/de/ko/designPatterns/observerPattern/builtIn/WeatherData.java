package de.ko.designPatterns.observerPattern.builtIn;

import java.util.Observable;

/**
 * java.util.Observable's flaws:
 *  - violates programming to interfaces not implementations
 *  - violates composition over inheritance
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementChanged() {
        setChanged();
        // pull method, there is a push method too
        notifyObservers();
    }

    public void setMeasurments(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }
}
