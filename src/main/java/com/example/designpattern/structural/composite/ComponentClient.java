package com.example.designpattern.structural.composite;

public class ComponentClient {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("pancake house menu", "breakfast");
        MenuComponent dinnerMenu = new Menu("dinner", "steak");
        MenuComponent coffeeMenu = new Menu("coffer", "smell good");
        MenuComponent dessertMenu = new Menu("dessert", "sweet");

        MenuComponent allMenus = new Menu("all menu", "all combined");
        allMenus.add(pancakeMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(coffeeMenu);

        pancakeMenu.add(new MenuItem("honey pancake", "delicious", 20, true));

        dinnerMenu.add(dessertMenu);
        dinnerMenu.add(new MenuItem("corn soup", "corn and ham", 60, false));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
