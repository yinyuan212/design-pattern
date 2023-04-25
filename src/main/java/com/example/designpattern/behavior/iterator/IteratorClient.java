package com.example.designpattern.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClient {

    public static void main(String[] args) {

        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();
//        ArrayList<MenuItem> menuItemArrayList = breakfastMenu.getMenuItems();
//        for (MenuItem menuItem : menuItemArrayList) {
//            System.out.println(menuItem);
//        }

        Iterator breakfastMenuIterator = breakfastMenu.createIterator();
        printMenu(breakfastMenuIterator);

        System.out.println("-----");


//        MenuItem[] menuItemArray = lunchMenu.getMenuItems();
//        for(MenuItem menuItem : menuItemArray) {
//            System.out.println(menuItem);
//        }
        Iterator lunchMenuIterator = lunchMenu.createIterator();
        printMenu(lunchMenuIterator);


    }


    // 已經統一為 Iterator interface，所以可以多型，共用這個printMenu(Iterator iterator)
    public static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
