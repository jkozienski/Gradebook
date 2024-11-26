package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the ExamGrade class.
 */
public class ExamGradeTest {

    @Test
    public void testToString() throws InvalidGradeException {
        Subject subject = Subject.MATEMATYKA;
        double value = 4.5;
        String submissionDate = "2022-06-09";
        String examType = "Koncowy";
        int maxPoints = 100;
        int pointsScored = 85;

        ExamGrade examGrade = new ExamGrade(subject, value, submissionDate, examType, maxPoints, pointsScored);

        String result = examGrade.toString();

        String expected = "Ocena: 4.5 Przedmiot: MATEMATYKA, Data oddania: 2022-06-09Maks. pkt.:100 Zdobyte pkt.: 85 Egzamin: Koncowy";
        assertEquals(expected, result);
    }
}
