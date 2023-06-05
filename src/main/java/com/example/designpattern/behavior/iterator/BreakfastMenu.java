package com.example.designpattern.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenu implements Menu{
    ArrayList<MenuItem> menuItems;

    public BreakfastMenu() {

        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("egg", 10));
        menuItems.add(new MenuItem("milkTea", 20));
        menuItems.add(new MenuItem("sandwich", 30));

    }

    // createIterator()，建立BreakfastMenuIterator
    @Override
    public Iterator<MenuItem> createIterator() {
//        return new BreakfastMenuIterator(menuItems); // ArrayList本身就支援iterator
        return menuItems.iterator();
    }

    @Deprecated // 加入BreakfastMenuIterator後，就不用這個method了
    public ArrayList<MenuItem> getMenuItems() {
        return  menuItems;
    }


}
