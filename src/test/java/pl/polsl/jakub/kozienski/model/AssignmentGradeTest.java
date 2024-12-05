package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit tests for the AssignmentGrade class.
 * - Testing converting AssignmentGrade to string.
 */
public class AssignmentGradeTest {
    
    
    @ParameterizedTest
    @CsvSource({
        "MATEMATYKA, 4.0, 2024-01-01, Zadanie Dom, 'Ocena: 4.0 Przedmiot: MATEMATYKA, Data oddania: 2024-01-01 Zadanie: Zadanie Dom'",
        "FIZYKA, 5.0, 2024-02-01, Projekt, 'Ocena: 5.0 Przedmiot: FIZYKA, Data oddania: 2024-02-01 Zadanie: Projekt'"
    })
    void testToString(Subject subject, double value, String date, String title, String expected) 
        throws InvalidGradeException {
        AssignmentGrade grade = new AssignmentGrade(subject, value, date, title);
        assertEquals(expected, grade.toString());
    }
    
}
