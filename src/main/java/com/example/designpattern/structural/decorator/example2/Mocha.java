package com.example.designpattern.structural.decorator.example2;

public class Mocha extends CondimentDecorator{

    private Beverage beverage;
    public Mocha(Beverage beverage){ // 在constructor放入 被裝飾者，並放在Mocha的beverage變數，下面的method就可以呼叫到被裝飾者
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return "Mocha, " + beverage.getDescription(); // 這邊取得被裝飾者beverage的value，不是用super.getDescription()
    }
    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }


}
