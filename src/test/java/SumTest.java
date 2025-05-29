import org.example.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    private final Sum sum = new Sum();

    @Test
    public void givenValidIntegersCalculateSum() {
        assertEquals(20, sum.perform(10, 10));
    }

    @Test
    public void givenValidNegativeIntegersCalculateSum() {
        assertEquals(-20, sum.perform(-10, -10));
    }
}
