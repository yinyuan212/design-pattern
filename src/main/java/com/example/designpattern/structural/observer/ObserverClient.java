package com.example.designpattern.structural.observer;

public class ObserverClient {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionDisplay());
        weatherData.registerObserver(new ForecastDisplay());

        weatherData.setMeasurements(30, 70, 50);
    }
}
