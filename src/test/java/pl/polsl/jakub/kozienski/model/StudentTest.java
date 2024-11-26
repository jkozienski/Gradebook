package pl.polsl.jakub.kozienski.model;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Student class
 */
public class StudentTest {
    private Subject subject;

    @Test
    public void testAddGrade() throws InvalidGradeException {
        Student student = new Student("Jan", "Nowak", 100);
        Grade grade = new AssignmentGrade(subject.MATEMATYKA, 4.1, "2023-11-19", "Obliczanie pola trojkata");
        student.addGrade(grade);

        assertEquals(1, student.getGrades().size());
        assertEquals(grade, student.getGrades().get(0));
    }

    @Test
    public void testCalculateAverageGrade_NoGrades() {
        Student student = new Student("Jan", "Nowak", 100);

        double average = student.calculateAverageGrade();
        
        assertEquals(0.0, average, 0.01, "Srednia powina wynosic 0.0 gdy nie ma zadnych ocen.");
    }

    @Test
    public void testCalculateAverageGrade_WithGrades() throws InvalidGradeException {
        Student student = new Student("Jan", "Nowak", 100);
        student.addGrade(new AssignmentGrade(subject.FIZYKA, 5.0, "2024-11-19", "ZadanieDom"));
        student.addGrade(new ExamGrade(subject.BIOLOGIA, 5.0, "2024-11-20", "Koncowy", 100, 90));

        double average = student.calculateAverageGrade();

        assertEquals(5.0, average, 0.01, "Average grade should be calculated correctly.");
    }


    @Test
    public void testToString() throws InvalidGradeException {
        Student student = new Student("Jan", "Nowak", 100);
        student.addGrade(new AssignmentGrade(subject.FIZYKA, 3.0, "2024-11-19", "ZadanieDom"));
        student.addGrade(new ExamGrade(subject.BIOLOGIA, 3.0, "2024-11-20", "Koncowy", 100, 55));

        String result = student.toString();

        assertTrue(result.contains("Jan"));
        assertTrue(result.contains("Nowak"));
        assertTrue(result.contains("100"));
        assertTrue(result.contains("3.0"));
    }

   
}
