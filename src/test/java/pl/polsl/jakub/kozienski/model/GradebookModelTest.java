package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit tests for the GradebookModel class.
 * - Testing history operations.
 * - Testing adding students.
 * - Testing removing existing and non existing students.
 * - Testing adding grades to existing and non existing students.
 */
public class GradebookModelTest {

    private GradebookModel model;
    private Student student;
    
    @BeforeEach
    public void setUp() {
       model = new GradebookModel();
       student = new Student("Jan", "Nowak", 100);
    }
    
   @ParameterizedTest
    @CsvSource({
        "Dodano studenta",
        "Usunieto studenta",
        "Dodano ocene z egzaminu",
        "Dodano ocene z zadania"
    })
    void testAddOperationHistory(String operationDescription) {
        model.addOperationHistory(operationDescription);

        List<OperationHistory> history = model.getOperationHistoryList();
        assertEquals(1, history.size());
        assertEquals(operationDescription, history.get(0).operation());
        assertNotNull(history.get(0).timestamp());
    }

   @ParameterizedTest
   @CsvSource({
        "Jan, Kowalski, 1",
        "Anna, Nowak, 2",
        "Piotr, Tomczak, 3"
    })
    void testAddStudent(String firstName, String lastName, int id) {
        Student student = new Student(firstName, lastName, id);
        
        model.addStudent(student);
        
        assertEquals(student, model.getStudentById(id));
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 200, 300})
    void testRemoveExistingStudent(int studentId) {
        Student existingStudent = new Student("Test", "Student", studentId);
        model.addStudent(existingStudent);
        boolean removed = model.removeStudentById(studentId);
        assertTrue(removed);
        assertNull(model.getStudentById(studentId));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,0, 9999})
    public void testRemoveNonExistingStudent(int invalidId) {
        boolean removed = model.removeStudentById(invalidId);

        assertFalse(removed);
    }
        
    @ParameterizedTest
    @CsvSource({
        "100, MATEMATYKA, 4.5, 2024-11-20, Zadanie domowe",
        "101, FIZYKA, 5.0, 2024-11-21, Projekt",
        "102, INFORMATYKA, 3.5, 2024-11-22, Laboratorium"
    })
    public void testAddAssignmentGradeToExistingStudent(int studentId, Subject subject, double value, String date, String title) {
        Student testStudent = new Student("Test", "Student", studentId);
        model.addStudent(testStudent);

        model.addGradeAssignmentToStudent(studentId, subject, value, date, title);

        List<Grade> grades = testStudent.getGrades();
        assertEquals(1, grades.size());
        assertTrue(grades.get(0) instanceof AssignmentGrade);
        AssignmentGrade grade = (AssignmentGrade) grades.get(0);
        assertEquals(title, grade.getAssignmentTitle());
        assertEquals(value, grade.getValue(), 0.01);
    }

  
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 999999})
    void testAddAssignmentGradeToNonExistingStudent(int invalidId) {
        model.addGradeAssignmentToStudent(invalidId, Subject.MATEMATYKA, 4.5, "2024-11-20", "Zadanie domowe");
        
        assertTrue(model.getStudents().isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
        "100, FIZYKA, 5.0, 2024-11-21, Koncowy, 100, 85",
        "101, MATEMATYKA, 4.0, 2024-11-22, Poprawkowy, 50, 40",
        "102, CHEMIA, 3.5, 2024-11-23, Zaliczeniowy, 30, 20"
    })
    public void testAddGradeExamToStudentValidData(int studentId, Subject subject, double value, String date, String examType, int maxPoints, int pointsScored) {
        Student testStudent = new Student("Test", "Student", studentId);
           
        model.addStudent(testStudent);

        model.addGradeExamToStudent(studentId, subject, value, date, examType, maxPoints, pointsScored);

        List<Grade> grades = testStudent.getGrades();
        assertEquals(1, grades.size());
        assertTrue(grades.get(0) instanceof ExamGrade);
        ExamGrade grade = (ExamGrade) grades.get(0);
        assertEquals(examType, grade.getExamType());
        assertEquals(value, grade.getValue(), 0.01);
        assertEquals(pointsScored, grade.getPointsScored());
        assertEquals(maxPoints, grade.getMaxPoints());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 999999})
    void testAddExamGradeToNonExistingStudent(int invalidId) {
        model.addGradeExamToStudent(invalidId, Subject.FIZYKA, 5.0, "2024-11-21", "Koncowy", 100, 85);
        
        assertTrue(model.getStudents().isEmpty());
    }
}


