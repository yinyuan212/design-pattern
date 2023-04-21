package com.example.designpattern.creational.factory_method.example1;

public class FactoryMethodClient {

    /**
     * 衣服工廠，生產Jacket跟Shirts
     * -> 建立兩種JacketFactory跟 ShirtsFactory，都繼承 ClothFactory
     *
     */
    public static void main(String[] args) {

        // Factory Method
        ClothFactory jacketFactory = new JacketFactory();
        Clothes jacket = jacketFactory.getProduct();
        System.out.println(jacket.getName());

        ClothFactory shirtsFactory = new ShirtsFactory();
        Clothes shirts = shirtsFactory.getProduct();
        System.out.println(shirts.getName());


        // Simple Factory
        // 把if else包在SimpleFactory裡面
        ClothFactory clothFactory = SimpleFactory.createFactory("jacket");
        Clothes clothes = clothFactory.getProduct();
        System.out.println(clothes.getName());


    }
}
