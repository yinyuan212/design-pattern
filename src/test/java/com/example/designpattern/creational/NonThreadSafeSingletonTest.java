package com.example.designpattern.creational;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.designpattern.creational.singleton.NonThreadSafeSingleton;

public class NonThreadSafeSingletonTest {

    @Test
    public void testSingleton(){

        NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance("active");
        NonThreadSafeSingleton anotherSingleton = NonThreadSafeSingleton.getInstance("deleted");

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        Assertions.assertEquals("active", singleton.getState());
        Assertions.assertNotEquals("deleted", anotherSingleton.getState());


    }

}
