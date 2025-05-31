import org.example.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    public void givenSumOperationTypeReturnSum() {
        int num1 = 10;
        int num2 = 20;

        int res = calculator.calculate(OperationType.SUM, num1, num2);
        assertEquals(20, res);
    }

}
