import org.example.TokenParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TokenParserTest {
    private TokenParser tokenParser = new TokenParser();

    @Test
    public void givenOperandsParseInt() {
        String[] operands = new String[2];
        operands[0] = "10";
        operands[1] = "20";

        int[] res = tokenParser.parseOperands(operands);
        assertEquals(10, res[0]);
        assertEquals(20, res[1]);
    }

    @Test
    public void givenOperandsIfNotIntThrowAnError() {
        String[] operands = new String[2];
        operands[0] = "10.0";
        operands[1] = "abc";

        assertThrows(NumberFormatException.class, () -> {
            tokenParser.parseOperands(operands);
        });
    }

    @Test
    public void givenInputParseSumOperator() {
        String[] tokens = new String[3];

        tokens[0] = "10";
        tokens[1] = "+";
        tokens[2] = "20";

        String res = tokenParser.parseOperator(tokens);
        assertEquals("+", res);
    }

}
