package com.example.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent { // 這是Component，所以override add(), remove(), getChild()
    List<MenuComponent> list = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent GetChild(int i) {
        return (MenuComponent) list.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() { // 使用ArrayList的iterator，可以利用遞迴的效果，印出所有node & leaf的內容
        System.out.println("This is " + getName() + ", " + getDescription());

        Iterator<MenuComponent> iterator = list.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }

        System.out.println("-------------------------------------");
    }
}
