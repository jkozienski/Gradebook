/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;
/**
 *
 * @author Jakub Kozienski
 * @version 1.0
 *
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Gradebook model class responsible for managing student data and their grades
 */
@Getter
public class GradebookModel {

    
    /**
    *
    */
    private List<OperationHistory> operationHistoryList = new ArrayList<>();
      
    
    /**
     * List of students in the gradebook
     */
    private List<Student> students;

    /**
     * Initializes a gradebook with an empty list of students
     */
    public GradebookModel() {
        students = new ArrayList<>();
    }
    /**
     *
     * @param operationDescription
     */
    public void addOperationHistory(String operationDescription) {
        operationHistoryList.add(new OperationHistory(operationDescription, LocalDateTime.now()));
    }

    /**
     * Adds a new student to the gradebook
     *
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Finds student by their ID
     *
     * @param studentId the ID of the student to find
     * @return the student if found; otherwise, returns null
     */
    public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;

            }
        }
        return null;
    }

    /**
     * Removes student by their ID
     *
     * @param studentId the ID of the student to be removed
     * @return true if the student was successfully removed, false otherwise
     */
    public boolean removeStudentById(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            students.remove(student);

            return true;
        }
        return false;
    }

    /**
     * Adds an assignment grade to a student by their ID
     *
     * @param studentId the ID of the student receiving the grade
     * @param subject the subject of the assignment
     * @param value the value of the grade
     * @param submissionDate the date of submission
     * @param assignmentTitle the title of the assignment
     */
    public void addGradeAssignmentToStudent(int studentId, Subject subject, double value, String submissionDate, String assignmentTitle) {
        Student student = getStudentById(studentId);
        if (student != null) {
            try {
                AssignmentGrade grade = new AssignmentGrade(subject, value, submissionDate, assignmentTitle);
                student.addGrade(grade);

            } catch (InvalidGradeException e) {
                // view.displayError("Niepoprawna wartosc oceny: " + e.getMessage());
            }
        }
    }
        
    /**
     * Adds an exam grade to a student by their ID
     *
     * @param studentId the ID of the student receiving the grade
     * @param subject the subject of the exam
     * @param value the value of the grade
     * @param submissionDate the date of submission
     * @param examType the type of exam (e.g., "midterm", "final")
     * @param maxPoints the maximum points possible on the exam
     * @param pointsScored the points scored by the student
     */
    public void addGradeExamToStudent(int studentId, Subject subject, double value, String submissionDate, String examType, int maxPoints, int pointsScored) {
        Student student = getStudentById(studentId);
        if (student != null) {
            try {
                ExamGrade grade = new ExamGrade(subject, value, submissionDate, examType, maxPoints, pointsScored);
                student.addGrade(grade);

            } catch (InvalidGradeException e) {
                // view.displayError("Niepoprawna wartosc oceny: " + e.getMessage());
            }
        }
    }
}
    
