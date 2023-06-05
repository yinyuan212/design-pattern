package com.example.designpattern.structural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }
}
