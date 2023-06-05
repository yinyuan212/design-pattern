package com.example.designpattern.creational;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import com.example.designpattern.creational.singleton.DoubleCheckLockingSingleton;

public class DoubleCheckLockingSingletonTest {

    @Test
    public void testDoubleCheckingSingleton(){

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 30,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(50000), new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 10; i++){
            threadPoolExecutor.execute(() ->{
                DoubleCheckLockingSingleton singleton = DoubleCheckLockingSingleton.getInstance(1);
                System.out.println(Thread.currentThread().getName() + " : " + singleton.increaseCounter());
            });

        }
    }
}