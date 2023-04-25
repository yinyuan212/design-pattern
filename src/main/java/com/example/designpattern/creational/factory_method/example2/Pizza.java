    package com.example.designpattern.creational.factory_method.example2;

    public abstract class Pizza {

        String name;
        String dough;
        String sauce;

        void prepare() {
            System.out.println("Preparing: " + name + ", " + dough + ", " + sauce );
            System.out.println("Tossing dough...");
        };
        void bake() {
            System.out.println("Bake for 25 minutes at 350");
        }
        void cut() {
            System.out.println("Cutting pizza into diagonal slices");
        }
        void box() {
            System.out.println("Place pizza in official PizzaStore box");
        }
    }
