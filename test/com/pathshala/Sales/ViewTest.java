package com.pathshala.Sales;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ViewTest {
    private ByteArrayInputStream inputStream = new ByteArrayInputStream("1 book at 12.49".getBytes());
    @Before
    public void setUp() {
       System.setIn(inputStream);
    }

    @Test
    public void shouldTakeUserInput() {
        View view = new View(new Scanner(System.in));

        String actualInput = view.readLine();
        String expectedInput= "1 book at 12.49";

        assertThat(expectedInput, is(expectedInput) );
    }

}