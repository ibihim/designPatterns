package de.ko.designPatterns.observerPattern.builtIn;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurments(21, 65, 30.4f);
        weatherData.setMeasurments(22, 70, 29.2f);
        weatherData.setMeasurments(19, 90, 29.2f);
    }
}
