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
        String userInput = view.readLine();
    }
}
