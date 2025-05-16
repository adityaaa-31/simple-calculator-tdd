package org.example;

public class TokenParser {
    public int[] parseOperands(String[] operands) {
        int[] convertedOperands = new int[2];
        convertedOperands[0] = Integer.parseInt(operands[0]);
        convertedOperands[1] = Integer.parseInt(operands[1]);

        return convertedOperands;
    }
}
