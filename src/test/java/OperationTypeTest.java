import org.example.OperationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationTypeTest {

    @Test
    public void givenPlusSymbol_shouldReturnSumEnum() {
        assertEquals(OperationType.SUM, OperationType.fromSymbol("+"));
    }

    @Test
    public void givenMinusSymbol_shouldReturnDifferenceEnum() {
        assertEquals(OperationType.DIFFERENCE, OperationType.fromSymbol("-"));
    }

    @Test
    public void givenMultiplySymbol_shouldReturnProductEnum() {
        assertEquals(OperationType.PRODUCT, OperationType.fromSymbol("*"));
    }

    @Test
    public void givenInvalidSymbol_shouldThrowException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> OperationType.fromSymbol("}")
        );
        assertEquals("Invalid Operator", exception.getMessage());
    }
}
