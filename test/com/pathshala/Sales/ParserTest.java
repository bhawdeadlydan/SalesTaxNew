package com.pathshala.Sales;

import org.junit.Test;

import java.util.Scanner;

public class ParserTest {

    @Test
    public void shouldParseUserInput() {
        View view = new View(new Scanner(System.in));
        Parser parser = new Parser(view);


    }

}