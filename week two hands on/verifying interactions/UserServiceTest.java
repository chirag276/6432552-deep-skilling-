import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testSendMessageCalledWithCorrectArgument() {
        // Step 1: Create mock object
        Notifier mockNotifier = mock(Notifier.class);

        // Step 2: Create service and invoke method
        UserService userService = new UserService(mockNotifier);
        userService.registerUser("Alice");

        // Step 3: Verify interaction
        verify(mockNotifier).sendMessage("Welcome Alice");
    }
}

