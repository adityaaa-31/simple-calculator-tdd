import org.example.UserInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserInputTest {

    @InjectMocks
    private UserInput userInput;

    @Mock
    private Scanner scanner;

    @Test
    public void givenInputCheckInputNotNull() {
        when(scanner.nextLine()).thenReturn("10 + 12");
        String res = userInput.getInput();
        assertNotNull(res);
    }
}
