package com.example.designpattern.behavior.iterator;

import java.util.ArrayList;

public class LunchMenu implements Menu {
    MenuItem[] menuItems;

    public LunchMenu() {

        menuItems = new MenuItem[5];

        menuItems[0] = new MenuItem("rice", 10);
        menuItems[1] = new MenuItem("noodle", 20);
        menuItems[2] = new MenuItem("soup", 30);
        menuItems[3] = new MenuItem("meat", 40);
        menuItems[4] = new MenuItem("bear", 50);

    }

    @Override
    public LunchMenuIterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }

    @Deprecated
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
