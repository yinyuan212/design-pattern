package com.example.designpattern.creational;

import com.example.designpattern.creational.builder.*;
import com.example.designpattern.creational.builder.components.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void testBuilder(){

        Director director = new Director();

        CarBuilderImpl sportsCarBuilder = new CarBuilderImpl();
        director.constructSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.build();

        CarBuilderImpl suvCarBuilder = new CarBuilderImpl();
        director.constructSUV(suvCarBuilder);
        Car suvCar = suvCarBuilder.build();

        System.out.println(sportsCar);
        System.out.println(suvCar);

        Assertions.assertEquals(sportsCar.getCarType(), CarType.SPORTS_CAR);
        Assertions.assertEquals(sportsCar.getSeats(), 2);

    }

//    @Test
//    void ttt(){

//        Widget widget = Widget.builder()   //會error  why??
//                .name("foo")
//                .id(1)
//                .build();
////        System.out.println(widget.toString());
//    }
}
