package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit tests for the Grade class.
 * - Testing converting Grade to string.
 */
public class GradeTest {
    
   @ParameterizedTest
    @CsvSource({
        "MATEMATYKA, 5.0, 2024-01-01, 'Ocena: 5.0 Przedmiot: MATEMATYKA, Data oddania: 2024-01-01'",
        "FIZYKA, 3.5, 2024-02-01, 'Ocena: 3.5 Przedmiot: FIZYKA, Data oddania: 2024-02-01'",
        "INFORMATYKA, 4.0, 2024-03-01, 'Ocena: 4.0 Przedmiot: INFORMATYKA, Data oddania: 2024-03-01'"
    })
    
    void testToStringParameterized(Subject subject, double value, String date, String expected) throws InvalidGradeException {
        Grade grade = new Grade(subject, value, date);
        assertEquals(expected, grade.toString());
    }
    
}



