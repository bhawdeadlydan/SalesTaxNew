package com.pathshala.Sales;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View(Scanner scanner) {
        this.scanner =scanner;
    }

    public String readLine() {
        return scanner.nextLine();
    }
}
