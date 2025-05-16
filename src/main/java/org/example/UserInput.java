package org.example;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        System.out.println("Enter your operation");
        return scanner.nextLine();
    }

}
