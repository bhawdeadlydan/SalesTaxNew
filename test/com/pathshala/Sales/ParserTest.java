package com.pathshala.Sales;

import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldParseUserInput() {
        View view = new View(new Scanner(System.in));
        HashMap<String, String[]> masterList = new HashMap<String, String[]>();
        Parser parser = new Parser(view, masterList);


        Item actualItem = parser.parse("1 book at 12.79");

        Item expectedItem = new Item(12.79, false, 1, "book", true);

        assertEquals(actualItem, is(expectedItem));

    }

}