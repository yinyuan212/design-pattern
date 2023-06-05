package com.example.designpattern.structural.observer;

public class ForecastDisplay implements Observer, DisplayElement{

    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void display() {
        System.out.println(String.format("ForecastDisplay - temperature: %s, humidity: %s, pressure: %s", temperature, humidity, pressure));
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
