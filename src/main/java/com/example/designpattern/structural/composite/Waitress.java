package com.example.designpattern.structural.composite;

public class Waitress {
    MenuComponent allmenus;

    public Waitress(MenuComponent allmenus) {
        this.allmenus = allmenus;
    }

    public void printMenu() {
        allmenus.print();
    }
}
