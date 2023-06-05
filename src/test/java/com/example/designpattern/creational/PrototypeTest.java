package com.example.designpattern.creational;

import com.example.designpattern.creational.prototype.Circle;
import com.example.designpattern.creational.prototype.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    void testPrototype(){

        Circle circle1 = new Circle();
        circle1.radius = 10;
        circle1.x = 5;
        circle1.y = 8;
        circle1.color = "red";

        Circle circle2 = (Circle) circle1.clone();

        System.out.println("hashCode1:" + circle1.hashCode());
        System.out.println("hashCode2:" + circle2.hashCode());

        Assertions.assertTrue(circle1.equals(circle2));
        Assertions.assertEquals(circle1.hashCode(), circle2.hashCode());

    }
}
