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
        String input = "10 + 20";
        int res = calculator.calculate(input);
        assertEquals(20, res);
    }

}
