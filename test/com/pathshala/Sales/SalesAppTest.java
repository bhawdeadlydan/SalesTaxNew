package com.pathshala.Sales;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SalesAppTest {
    private ByteArrayInputStream inputStream = new ByteArrayInputStream("1 book at 12.49".getBytes());
    private SalesApp salesApp;


    @Test
    public void setUp() {

        View view = new View(new Scanner(System.in));

        HashMap<String, String[]> masterList = new HashMap<String, String[]>();
        masterList.put("food", new String[]{"FoodBookMedical", "FALSE"});
        masterList.put("music CD", new String[]{"", "FALSE"});
        masterList.put("bottle of perfume", new String[]{"", "FALSE"});
        masterList.put("packet of headache pills", new String[]{"FoodBookMedical", "FALSE"});
        masterList.put("box of chocolates", new String[]{"", "FALSE"});
        Parser parser = new Parser(view, masterList);

        ArrayList<Item> itemList = new ArrayList<Item>();
        salesApp = new SalesApp(view, parser, itemList);
        System.setIn(inputStream);

    }


    @Test
    public void shouldTakeUserInput() {
        View view = new View(new Scanner(System.in));

        salesApp.start();
        String actualInput = view.readLine();
        String expectedInput = "1 book at 12.49";

        assertThat(expectedInput, is(expectedInput));
    }


}