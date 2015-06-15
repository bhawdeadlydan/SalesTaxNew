package com.pathshala.Sales;

import java.util.HashMap;

public class Parser {
    private View view;
    private HashMap<String, String[]> masterList = new HashMap<String, String[]>();

    public Parser(View view, HashMap<String, String[]> masterList) {
        this.masterList = masterList;

        this.view = view;
    }

    public Item parse(String userInput) {

        if(userInput == "-1")return null;

        int amount = Integer.parseInt(userInput.split(" ")[0]);
        boolean isImported = userInput.split(" ")[1].contains("imported");
        double basePrice = Integer.parseInt(userInput.split(" ")[1].split(" at ")[1]);
        String name = userInput.split(" ")[1].split(" at ")[1].replace("imported", "");

        Boolean isFoodBookMedical = (masterList.get(name)[0] == "FoodBookMedical");

        Item item = new Item(basePrice, isImported, amount, name, isFoodBookMedical);
        return item;
    }
}
