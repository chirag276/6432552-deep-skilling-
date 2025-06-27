import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testGetProcessedDataWithMock() {
        // Mock the ExternalAPI
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        // Stub the method
        when(mockAPI.fetchData()).thenReturn("MockData");

        // Use the mock in the service
        MyService service = new MyService(mockAPI);

        // Assert result
        assertEquals("Processed: MockData", service.getProcessedData());
    }
}
