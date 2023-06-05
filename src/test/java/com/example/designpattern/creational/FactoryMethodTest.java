package com.example.designpattern.creational;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.designpattern.creational.factory_method.example1.ClothFactory;
import com.example.designpattern.creational.factory_method.example1.Clothes;
import com.example.designpattern.creational.factory_method.example1.JacketFactory;
import com.example.designpattern.creational.factory_method.example1.ShirtsFactory;

public class FactoryMethodTest {

    @Test
    public void testFactoryMethod(){

        ClothFactory jacketFactory = new JacketFactory();
        Clothes jacket = jacketFactory.getProduct();
        Assertions.assertEquals("Jacket", jacket.getName());


        ClothFactory shirtsFactory = new ShirtsFactory();
        Clothes shirts = shirtsFactory.getProduct();
        Assertions.assertEquals("Shirts", shirts.getName());
    }

}
