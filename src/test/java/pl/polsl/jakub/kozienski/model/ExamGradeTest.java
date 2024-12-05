package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit tests for the ExamGrade class.
 * - Testing converting ExamGrade to string.
 */
public class ExamGradeTest {

    @ParameterizedTest
    @CsvSource({
        "MATEMATYKA, 4.5, 2024-01-01, Koncowy, 100, 85, 'Ocena: 4.5 Przedmiot: MATEMATYKA, Data oddania: 2024-01-01Maks. pkt.:100 Zdobyte pkt.: 85 Egzamin: Koncowy'",
        "FIZYKA, 3.0, 2024-02-01, Poprawkowy, 50, 25, 'Ocena: 3.0 Przedmiot: FIZYKA, Data oddania: 2024-02-01Maks. pkt.:50 Zdobyte pkt.: 25 Egzamin: Poprawkowy'",
        "CHEMIA, 5.0, 2024-03-01, Zaliczeniowy, 30, 30, 'Ocena: 5.0 Przedmiot: CHEMIA, Data oddania: 2024-03-01Maks. pkt.:30 Zdobyte pkt.: 30 Egzamin: Zaliczeniowy'"
    })
    void testToStringParameterized(Subject subject, double value, String date, 
        String examType, int maxPoints, int pointsScored, String expected) 
        throws InvalidGradeException {
        ExamGrade grade = new ExamGrade(subject, value, date, examType, maxPoints, pointsScored);
        assertEquals(expected, grade.toString());
    }
}
