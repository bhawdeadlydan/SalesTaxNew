package com.pathshala.Sales;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemTest {
    @Test
    public void shouldReturnVisualRepresentation() {
        Item item = new Item(12.49, false, 1, "book", true);

        String actualOutput = item.toString();
        String expectedOutput = "1 book at 12.49";
        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldCalculateSalesTax() {
        Item item = new Item(12.49, false, 1, "book", true);

        double salesTax = item.salesTax();

    }

    @Test
    public void shouldBeEqualToItself() {
        Item firstItem = new Item(12.49, false, 1, "book", true);

        boolean actual = firstItem.equals(firstItem);

        assertThat(actual, is(true));
    }

    @Test
    public void shouldFollowSymmetricProperty() {
        Item firstItem = new Item(12.49, false, 1, "book", true);
        Item secondItem = new Item(12.49, false, 1, "book", true);

        boolean actual = (firstItem.equals(secondItem) == secondItem.equals(firstItem));

        assertThat(actual, is(true));
    }

    @Test
    public void shouldFollowTransitiveProperty() {
        Item firstItem = new Item(12.49, false, 1, "book", true);
        Item secondItem = new Item(12.49, false, 1, "book", true);
        Item thirdItem = new Item(12.49, false, 1, "book", true);

        boolean actual = firstItem.equals(secondItem) &&
                secondItem.equals(thirdItem) &&
                firstItem.equals(thirdItem);

        assertThat(actual, is(true));
    }

    @Test
    public void shouldHaveSameHashCodeIfItemsAreEqual() {
        Item firstItem = new Item(12.49, false, 1, "book", true);
        Item secondItem = new Item(12.49, false, 1, "book", true);

        boolean actual = firstItem.equals(secondItem) && (firstItem.hashCode() == secondItem.hashCode());

        assertThat(actual, is(true));
    }

}