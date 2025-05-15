import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuatorTest {

    @Test
    public void givenTwoDigitsCalculateSum() {
        Calculator calculator = new Calculator(10, 20);

        int num1 = 10;
        int num2 = 20;

        assertEquals(num1 + num2, calulator.sum());
    }

}
