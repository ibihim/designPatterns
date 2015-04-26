package de.ko.designPatterns.observerPattern.selfMade;

import de.ko.designPatterns.observerPattern.selfMade.observers.CurrentConditionsDisplay;
import de.ko.designPatterns.observerPattern.selfMade.observers.ForecastDisplay;
import de.ko.designPatterns.observerPattern.selfMade.observers.StatisticsDisplay;
import de.ko.designPatterns.observerPattern.selfMade.subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurments(21, 65, 30.4f);
        weatherData.setMeasurments(22, 70, 29.2f);
        weatherData.setMeasurments(19, 90, 29.2f);
    }
}
