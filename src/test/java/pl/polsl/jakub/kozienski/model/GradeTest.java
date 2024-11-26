package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Grade class
 */
public class GradeTest {

    @Test
    public void testToString() throws InvalidGradeException {
        Subject subject = Subject.MATEMATYKA;
        double value = 5.0;
        String submissionDate = "2024-11-19";

        Grade grade = new Grade(subject, value, submissionDate);
        String result = grade.toString();

        String expected = "Ocena: 5.0 Przedmiot: MATEMATYKA, Data oddania: 2024-11-19";
        assertEquals(expected, result);
    }
}
