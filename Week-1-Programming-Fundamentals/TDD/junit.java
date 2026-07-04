/*
===========================================
JUnit Example

Scenario:
Testing Student Result
===========================================
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Student {

    boolean hasPassed(int marks) {
        return marks >= 40;
    }
}

public class JUnitExamples {

    Student student = new Student();

    @Test
    void testStudentPass() {

        assertTrue(student.hasPassed(75));

    }

    @Test
    void testStudentFail() {

        assertFalse(student.hasPassed(30));

    }
}
