package com.company;

import com.company.Models.PizzaMenu;
import com.company.Models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        PizzaMenu menu = new PizzaMenu();

        menu.addItem(new PizzaMenuItem("margharita", "klasika", 110));
        menu.addItem(new PizzaMenuItem("Proscuto", "Šunková", 125));
        menu.addItem(new PizzaMenuItem("Hawai", "Šunková s ananasem", 130));

        for (PizzaMenuItem item:menu.getItems()) {
            System.out.println(item);
        }
    }
}
