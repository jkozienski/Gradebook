/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.model;
import lombok.*;

/**
 * Class representing an assignment grade.
 * This class extends the Grade class and adds additional fields for assignment title,
 * due date, and the weight of the assignment.
 *
 * @author Jakub
 */
@Getter
public class AssignmentGrade extends Grade {
    /**
    *The title of the assignment
    */
    private String assignmentTitle;
 
    /**
    *The weight of the assignment (
    */
    private int weight = 2;

    /**
     * Constructor to initialize an AssignmentGrade object.
     * 
     * @param subject The subject of the grade.
     * @param value The value of the grade.
     * @param submissionDate The date when the assignment was submitted.
     * @param assignmentTitle The title of the assignment.
     * @throws InvalidGradeException if the grade is invalid.
     */
    public AssignmentGrade(String subject, double value, String submissionDate, String assignmentTitle) throws InvalidGradeException {
        super(subject, value, submissionDate);
        this.assignmentTitle = assignmentTitle;
    }
    
    
    /**
     * Provides a string representation of the assignment grade including
     *
     * @return formatted string describing the assignment grade
     */
    @Override
    public String toString() {
        return super.toString()+ " Zadanie: " + assignmentTitle;
    }
}