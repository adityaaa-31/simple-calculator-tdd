import org.example.TokenParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
