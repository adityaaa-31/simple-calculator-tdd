import org.example.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    static Scanner scanner = new Scanner(System.in);
    static UserInput userInput = new UserInput(scanner);
    static TokenParser tokenParser = new TokenParser();
    static InputTokenizer inputTokenizer = new InputTokenizer();

    private final Calculator calculator;

    public CalculatorTest() {
        calculator = new Calculator(userInput, tokenParser,inputTokenizer);
    }

    public void givenSumOperationTypeReturnSum() {
        int num1 = 10;
        int num2 = 20;

        int res = calculator.calculate(OperationType.SUM, num1, num2);
        assertEquals(20, res);
    }

}
