package com.company.Models;

public class PizzaMenuItem {
    private String name;
    private String description;
    private int price;

    public PizzaMenuItem(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrize() {
        return price;
    }

    public void setPrize(int prize) {
        this.price = price;
    }
}
