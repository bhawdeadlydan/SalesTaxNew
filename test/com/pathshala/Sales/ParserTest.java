package com.pathshala.Sales;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class ParserTest {
    Parser parser;

    @Before
    public void setUp() {
        View view = new View(new Scanner(System.in));
        HashMap<String, String[]> masterList = new HashMap<String, String[]>();
        masterList.put("food", new String[]{"FoodBookMedical", "FALSE"});
        masterList.put("music CD", new String[]{"", "FALSE"});
        masterList.put("bottle of perfume", new String[]{"", "FALSE"});
        masterList.put("packet of headache pills", new String[]{"FoodBookMedical", "FALSE"});
        masterList.put("box of chocolates", new String[]{"", "FALSE"});
        parser = new Parser(view, masterList);

    }


    @Test
    public void shouldParseUserInput() {

        Item actualItem = parser.parse("1 book at 12.79");

        Item expectedItem = new Item(12.79, false, 1, "book", true);

        assertEquals(actualItem, is(expectedItem));

    }

    @Test

    public void shouldGiveNullObjectIsUserInputisMinusOne() {

        Item actualItem = parser.parse(new String("-1"));

        Item expectedItem = new Item(12.79, false, 1, "book", true);

        assertEquals(actualItem, is(expectedItem));
    }

}
