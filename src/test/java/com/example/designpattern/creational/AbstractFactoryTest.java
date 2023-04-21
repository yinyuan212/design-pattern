package com.example.designpattern.creational;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.designpattern.creational.abstract_factory.example1.Benz;
import com.example.designpattern.creational.abstract_factory.example1.CarFactory;
import com.example.designpattern.creational.abstract_factory.example1.Porsche;
import com.example.designpattern.creational.abstract_factory.example1.SedanFactory;
import com.example.designpattern.creational.abstract_factory.example1.SuvFactory;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory(){

        CarFactory suvFactory = new SuvFactory();
        Benz benzSuv = suvFactory.createBenz();
        Porsche porscheSuv = suvFactory.createPorsche();

        System.out.println(String.format("benzSuv, brand: %s, type: %s", benzSuv.getBrand(), benzSuv.getType()));
        System.out.println(String.format("porscheSuv, brand: %s, type: %s", porscheSuv.getBrand(), porscheSuv.getType()));

        Assertions.assertEquals("Benz", benzSuv.getBrand());
        Assertions.assertEquals("SUV", benzSuv.getType());
        Assertions.assertEquals("Porsche", porscheSuv.getBrand());
        Assertions.assertEquals("SUV", porscheSuv.getType());

        CarFactory sedanFactory = new SedanFactory();
        Benz benzSedan = sedanFactory.createBenz();
        Porsche porscheSedan = sedanFactory.createPorsche();

        System.out.println(String.format("benzSedan, brand: %s, type: %s", benzSedan.getBrand(), benzSedan.getType()));
        System.out.println(String.format("porscheSedan, brand: %s, type: %s", porscheSedan.getBrand(), porscheSedan.getType()));

        Assertions.assertEquals("Benz", benzSedan.getBrand());
        Assertions.assertEquals("sedan", benzSedan.getType());
        Assertions.assertEquals("Porsche", porscheSedan.getBrand());
        Assertions.assertEquals("sedan", porscheSedan.getType());

    }


}
