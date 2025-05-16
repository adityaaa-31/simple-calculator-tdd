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

}
