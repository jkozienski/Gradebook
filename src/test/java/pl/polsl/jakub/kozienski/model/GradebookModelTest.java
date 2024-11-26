package pl.polsl.jakub.kozienski.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.time.LocalDateTime;

/**
 * Unit tests for the GradebookModel class.
 */
public class GradebookModelTest {

    @Test
    public void testAddOperationHistory() {
        GradebookModel model = new GradebookModel();
        String operationDescription = "Dodano studenta";

        model.addOperationHistory(operationDescription);

        List<OperationHistory> history = model.getOperationHistoryList();
        assertEquals(1, history.size());
        assertEquals(operationDescription, history.get(0).operation());
        assertNotNull(history.get(0).timestamp());
    }

    @Test
    public void testAddStudent() {
        GradebookModel model = new GradebookModel();
        Student student = new Student("Jan", "Nowak", 100);

        model.addStudent(student);

        List<Student> students = model.getStudents();
        assertEquals(1, students.size());
        assertEquals(student, students.get(0));
    }

    @Test
    public void testRemoveStudentById_ExistingStudent() {
        GradebookModel model = new GradebookModel();
        Student student = new Student("Jan", "Nowak", 100);
        model.addStudent(student);

        boolean removed = model.removeStudentById(100);

        assertTrue(removed);
        assertNull(model.getStudentById(100));
    }

    @Test
    public void testRemoveStudentById_NonExistingStudent() {
        GradebookModel model = new GradebookModel();

        boolean removed = model.removeStudentById(999);

        assertFalse(removed);
    }

    @Test
    public void testAddGradeAssignmentToStudent_ValidData() {
        GradebookModel model = new GradebookModel();
        Student student = new Student("Jan", "Nowak", 100);
        model.addStudent(student);

        model.addGradeAssignmentToStudent(100, Subject.MATEMATYKA, 4.5, "2024-11-20", "Zadanie domowe");

        List<Grade> grades = student.getGrades();
        assertEquals(1, grades.size());
        assertTrue(grades.get(0) instanceof AssignmentGrade);
        AssignmentGrade grade = (AssignmentGrade) grades.get(0);
        assertEquals("Zadanie domowe", grade.getAssignmentTitle());
        assertEquals(4.5, grade.getValue(), 0.01);
    }

    @Test
    public void testAddGradeAssignmentToStudent_NonExistingStudent() {
        GradebookModel model = new GradebookModel();

        model.addGradeAssignmentToStudent(99999, Subject.MATEMATYKA, 4.5, "2024-11-20", "Zadanie domowe");

        assertTrue(model.getStudents().isEmpty());
    }

    @Test
    public void testAddGradeExamToStudent_ValidData() {
        GradebookModel model = new GradebookModel();
        Student student = new Student("Jan", "Nowak", 100);
        model.addStudent(student);

        model.addGradeExamToStudent(100, Subject.FIZYKA, 5.0, "2024-11-21", "Koncowy", 100, 85);

        List<Grade> grades = student.getGrades();
        assertEquals(1, grades.size());
        assertTrue(grades.get(0) instanceof ExamGrade);
        ExamGrade grade = (ExamGrade) grades.get(0);
        assertEquals("Koncowy", grade.getExamType());
        assertEquals(5.0, grade.getValue(), 0.01);
        assertEquals(85, grade.getPointsScored());
        assertEquals(100, grade.getMaxPoints());
    }

    @Test
    public void testAddGradeExamToStudent_NonExistingStudent() {
        GradebookModel model = new GradebookModel();

        model.addGradeExamToStudent(999999, Subject.FIZYKA, 5.0, "2024-11-21", "Koncowy", 100, 85);

        assertTrue(model.getStudents().isEmpty());
    }
}
