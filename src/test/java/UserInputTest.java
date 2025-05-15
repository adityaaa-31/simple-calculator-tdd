import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserInputTest {

    @InjectMocks
    private UserInput userInput;

    @Mock
    private Scanner scanner;

    @Test
    public void givenIntegerInputCheckIsNotNull() {
        when(scanner.nextInt()).thenReturn(10);
        Integer res = userInput.getInput();
        assertNotNull(res);
    }
}
