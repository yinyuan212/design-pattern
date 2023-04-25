package com.example.designpattern.behavior.iterator;

import java.util.Collections;
import java.util.Iterator;

public class LunchMenuIterator implements Iterator { // implements Iterator

    MenuItem[] menuItems;
    int index = 0;

    public LunchMenuIterator(MenuItem[] menuItems) { // Constructor要放入Collection
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (index >= menuItems.length || menuItems[index] == null) {
            return false;
        }

        return true;
    }


}
