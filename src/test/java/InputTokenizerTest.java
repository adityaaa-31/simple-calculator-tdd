import org.example.InputTokenizer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTokenizerTest {

    private InputTokenizer inputTokenizer = new InputTokenizer();

    @Test
    public void givenInputStringCheckValidSumOperator() {
        String input = "10 + 12";
        String[] operator = inputTokenizer.getTokens(input);
        assertEquals("+", operator[1]);
    }

    @Test
    public void givenInputStringCheckValidOperands() {
        String input = "10 + 12";
        String[] operands = inputTokenizer.getTokens(input);
        assertEquals("10", operands[0]);
        assertEquals("12", operands[2]);
    }

    @Test
    public void givenOperandsParseInt() {
        String[] operands = new String[2];
        operands[0] = "10";
        operands[1] = "20";

        int[] res = inputTokenizer.parseOperands(operands);
        assertEquals(10, res[0]);
        assertEquals(20, res[1]);
    }

}
