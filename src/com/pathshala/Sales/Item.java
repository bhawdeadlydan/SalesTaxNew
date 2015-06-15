package com.pathshala.Sales;

public class Item {
    private double basePrice;
    private boolean isImported;
    private int amount;
    String name;


    public Item(double basePrice, boolean isImported, int amount, String name) {
        this.basePrice = basePrice;
        this.amount = amount;
        this.isImported = isImported;
        this.name = name;
    }

    @Override
    public String toString() {
        return amount + ((isImported) ? " imported" : "") + " " + name + " " + "at" + " " + basePrice;
    }
}
