import org.example.OperationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationTypeTest {

    @Test
    public void givenPlusSymbol_shouldReturnSumEnum() {
        assertEquals(OperationType.SUM, OperationType.fromSymbol("+"));
    }

}
