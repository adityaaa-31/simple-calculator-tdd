package org.example;

import java.util.Map;

public class Calculator {
    private final Map<OperationType, Operation> operationMap;

    public Calculator() {
        operationMap = Map.of(
                OperationType.SUM, new Sum()
        );
    }

    public int calculate(OperationType operationType, int num1, int  num2) {
        Operation operation = operationMap.get(operationType);
        return operation.perform(num1, num2);
    }
}
