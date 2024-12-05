package pl.polsl.jakub.kozienski.model;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit tests for the Student class
 */
public class StudentTest {
    private Subject subject;
    private Student student;

    
    @BeforeEach
    public void setUp() {
       student = new Student("Jan", "Nowak", 100);
    }

    
    @Test
    public void testCalculateAverageGradeNoGrades() {
        double average = student.calculateAverageGrade();
        
        assertEquals(0.0, average, 0.01, "Srednia powina wynosic 0.0 gdy nie ma zadnych ocen.");
    }

    @ParameterizedTest
    @CsvSource({
        "5.0, 4.0, 3.0, 4.0",
        "2.0, 2.0, 2.0, 2.0",
        "6.0, 5.0, 4.0, 5.0"
    })
    void testCalculateAverageGrade(double grade1, double grade2, double grade3, double expected) 
        throws InvalidGradeException {
        student.addGrade(new Grade(Subject.MATEMATYKA, grade1, "2024-01-01"));
        student.addGrade(new Grade(Subject.FIZYKA, grade2, "2024-01-02"));
        student.addGrade(new Grade(Subject.CHEMIA, grade3, "2024-01-03"));

        assertEquals(expected, student.calculateAverageGrade(), 0.01);
    }
    
    @ParameterizedTest
    @CsvSource({
        "Jan, Kowalski, 1, 'ID: 1, Imie: Jan, Nazwisko: Kowalski, srednia: 0.0'",
        "Anna, Nowak, 2, 'ID: 2, Imie: Anna, Nazwisko: Nowak, srednia: 0.0'",
        "Piotr, Wisniewski, 3, 'ID: 3, Imie: Piotr, Nazwisko: Wisniewski, srednia: 0.0'"
    })
    void testToString(String firstName, String lastName, int id, String expected) {
        Student testStudent = new Student(firstName, lastName, id);
        assertEquals(expected, testStudent.toString());
    }
   
}


