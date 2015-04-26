package de.ko.designPatterns.observerPattern.selfMade.observers;

import de.ko.designPatterns.observerPattern.selfMade.subjects.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 60.0f;
    private float minTemp = -60;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings += 1;

        if (temp > maxTemp) {
            maxTemp = temp;
        } else if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        float avg = tempSum / numReadings;
        System.out.println("Avg/Max/Min temperature = " + avg + "/" + maxTemp + "/" + minTemp);
    }
}
