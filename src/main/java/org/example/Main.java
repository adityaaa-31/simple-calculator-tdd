package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static UserInput userInput = new UserInput(scanner);
    static TokenParser tokenParser = new TokenParser();
    static InputTokenizer inputTokenizer = new InputTokenizer();

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Calculator calculator = new Calculator();

        String input = userInput.getInput();
        String[] tokens = inputTokenizer.getTokens(input);
        String operatorString = tokenParser.parseOperator(tokens);
        int[] operands = tokenParser.parseOperands(tokens);

        OperationType operationType = OperationType.fromSymbol(operatorString);

        int res = calculator.calculate(operationType, operands[0], operands[1]);

        System.out.println(res);
    }

}