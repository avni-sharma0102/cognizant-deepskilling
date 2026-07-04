/*
===========================================
Mockito Example

Scenario:
Sending Welcome Message
===========================================
*/

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

interface MessageService {

    void sendMessage();

}

class Student {

    MessageService service;

    Student(MessageService service) {
        this.service = service;
    }

    void register() {

        System.out.println("Student Registered");

        service.sendMessage();

    }
}

public class MockitoExamples {

    @Test
    void testRegistration() {

        // Create a mock object
        MessageService service = mock(MessageService.class);

        // Pass the mock object
        Student student = new Student(service);

        // Call the method
        student.register();

        // Verify the message was sent
        verify(service).sendMessage();

    }
}
