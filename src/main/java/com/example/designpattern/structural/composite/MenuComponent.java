package com.example.designpattern.structural.composite;

public abstract class MenuComponent {

    // 給 composite 使用的
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("");
    }

    public MenuComponent GetChild(int i) {
        throw new UnsupportedOperationException("");
    }

    // 給 node 使用的

    public String getName() {
        throw new UnsupportedOperationException("");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("");
    }

    // composite 跟 node 都會用到的
    public void print() {
        throw new UnsupportedOperationException("");
    }
}
