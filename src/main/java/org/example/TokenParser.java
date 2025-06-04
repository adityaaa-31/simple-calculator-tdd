package org.example;

public class TokenParser {
    public int[] parseOperands(String[] tokens) {
        int[] convertedOperands = new int[2];

        convertedOperands[0] = Integer.parseInt(tokens[0].trim());
        convertedOperands[1] = Integer.parseInt(tokens[2].trim());

        return convertedOperands;
    }

    public String parseOperator(String[] tokens) {
        return tokens[1];
    }
}
