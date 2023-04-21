package com.example.designpattern.creational;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.designpattern.creational.singleton.EagerInitializationSingleton;

public class EagerInitializationSingletonTest {

    @Test
    public void testEagerInitializationSingleton(){

        EagerInitializationSingleton singleton = EagerInitializationSingleton.getInstance();
        System.out.println(singleton.getState());

        Assertions.assertEquals("active", singleton.getState());

    }
}