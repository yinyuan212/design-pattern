package com.example.designpattern.creational.builder;

import com.example.designpattern.creational.builder.components.*;

public interface CarBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer (TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
