package com.pathshala.Sales;

import java.util.ArrayList;

public class SalesApp {
    private View view;
    private Parser parser;
    private ArrayList<Item> itemList;

    public SalesApp(View view, Parser parser, ArrayList<Item> itemList) {
        this.view = view;
        this.parser = parser;
        this.itemList = itemList;
    }

    public void start() {
        double totalSalesTax;
        double totalPrice;
        Item item = new Item();
        String userInput = view.readLine();
        while (item != null) {
            item = parser.parse(userInput);
            itemList.add(item);
        }
        for(Item itemToOutput : itemList)
            view.print(itemToOutput.toString());
        totalSalesTax += itemToOutput.calculateSalesTax();
        totalPrice += itemToOutput.price();
    }
}
