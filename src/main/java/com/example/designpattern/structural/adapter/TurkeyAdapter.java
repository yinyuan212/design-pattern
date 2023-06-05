package com.example.designpattern.structural.adapter;

public class TurkeyAdapter implements Duck { // implements 要被轉換成的物件 (turkey 要轉換成 Duck)

    Turkey turkey; //利用合成的方式放進要轉換的物件

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
