package com.example.designpattern.creational.singleton;

public class DoubleCheckLockingSingleton {

    private static DoubleCheckLockingSingleton instance;

    private int counter;

    private DoubleCheckLockingSingleton(){
    }

    public static DoubleCheckLockingSingleton getInstance(int counter){

        if(instance == null) { // first check
            synchronized(DoubleCheckLockingSingleton.class){
                if (instance == null) { // second check
                    instance = new DoubleCheckLockingSingleton();
                    instance.counter = counter;
                }
            }
        }

        return instance;
    }

    public synchronized int increaseCounter(){
        return instance.counter++;
    }

}
