package com.example.designpattern.structural.adapter;

public class AdapterClient {

    public static void main(String[] args) {

        Duck duck = new GreenDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new RedTurkey();
        turkey.gobble();
        turkey.fly();

        // turkey 跟 duck是不同介面，client可以透過turkeyAdapter，用Duck介面的方法呼叫turkey的方法

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }



}
