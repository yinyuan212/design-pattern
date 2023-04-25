package com.example.designpattern.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenuIterator implements Iterator<MenuItem> {

    ArrayList<MenuItem> menuItems;
    int index = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(index);
        index++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(index >= menuItems.size() || menuItems.get(index) == null) {
            return false;
        }

        return true;
    }


}
