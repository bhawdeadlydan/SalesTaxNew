package com.pathshala.Sales;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemTest {
    @Test
    public void shouldReturnVisualRepresentation() {
        Item item = new Item(12.49, false, 1, "book");

        String actualOutput = item.toString();
        String expectedOutput = "1 book at 12.49";
        assertThat(actualOutput, is(expectedOutput));
    }

}