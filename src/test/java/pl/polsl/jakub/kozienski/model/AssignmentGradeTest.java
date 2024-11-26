package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the AssignmentGrade class.
 */
public class AssignmentGradeTest {

    @Test
    public void testToString() throws InvalidGradeException {
        Subject subject = Subject.MATEMATYKA;
        double value = 5.0;
        String submissionDate = "2024-11-20";
        String assignmentTitle = "Zadanie domowe 1";

        AssignmentGrade assignmentGrade = new AssignmentGrade(subject, value, submissionDate, assignmentTitle);

        String result = assignmentGrade.toString();

        String expected = "Ocena: 5.0 Przedmiot: MATEMATYKA, Data oddania: 2024-11-20 Zadanie: Zadanie domowe 1";
        assertEquals(expected, result);
    }
}
