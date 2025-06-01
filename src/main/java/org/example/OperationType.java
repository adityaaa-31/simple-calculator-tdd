package org.example;

import java.util.Arrays;

public enum OperationType {
        SUM("+"),
        DIFFERENCE("-"),
        PRODUCT("*"),
        DIVISION("/");

        private final String symbol;

        OperationType(String symbol) {
            this.symbol = symbol;
        }

        public static OperationType fromSymbol(String symbol) {
            return Arrays.stream(values())
                    .filter(op -> op.symbol.equals(symbol))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        }
    }
