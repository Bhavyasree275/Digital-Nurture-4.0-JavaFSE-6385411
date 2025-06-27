package org.example;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceVerifyTest {

    @Test
    public void testMethodCallVerification() {
        // Step 1: Create mock of ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Optional: Stub getData() to avoid null return
        when(mockApi.getData()).thenReturn("Dummy Value");

        // Step 2: Inject mock into MyService
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify interaction (method was called once)
        verify(mockApi).getData();
    }
}
