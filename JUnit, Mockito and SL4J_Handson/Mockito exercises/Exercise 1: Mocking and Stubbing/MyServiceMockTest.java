package org.example;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceMockTest {

    @Test
    public void testMockingAndStubbing() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject into service
        MyService service = new MyService(mockApi);

        // Step 4: Call method and verify output
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
