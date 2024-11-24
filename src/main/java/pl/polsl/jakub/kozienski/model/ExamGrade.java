/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.model;
import lombok.*;
/**
 * Class representing an exam grade.
 * This class extends the Grade class and adds additional fields for exam type,
 * maximum points, and points scored.
 *
 * @author Jakub
 */
@Getter
public class ExamGrade extends Grade {
    
     /**
     * The type of the exam (e.g., final, midterm).
     */
    private String examType;
    
     /**
     * The weight of the exam (default is 3).
     */
    private int weight = 3;
    
      /**
     * The maximum points achievable in the exam.
     */
    private int maxPoints;   
    
     /**
     * The points scored by the student in the exam.
     */
    private int pointsScored;    

    
      /**
     * Constructor to initialize an ExamGrade object.
     * 
     * @param subject The subject of the grade.
     * @param value The value of the grade.
     * @param submissionDate The date when the exam grade was submitted.
     * @param examType The type of the exam (e.g., final, midterm).
     * @param maxPoints The maximum points that can be scored in the exam.
     * @param pointsScored The points that were scored in the exam.
     * @throws InvalidGradeException if the grade is invalid.
     */
    public ExamGrade(String subject, double value, String submissionDate, String examType, int maxPoints, int pointsScored) throws InvalidGradeException {
        super(subject, value, submissionDate);
        this.examType = examType;
        this.maxPoints = maxPoints;
        this.pointsScored = pointsScored;
    }
    
    
    
     /**
     * Provides a string representation of the exam grade, including the maximum points,
     * points scored, and exam type.
     * 
     * @return A formatted string describing the exam grade.
     */
    @Override
    public String toString() {
        return super.toString() + "Maks. pkt.:"+maxPoints+ " Zdobyte pkt.: " +pointsScored+" Egzamin: " + examType;
    }
}
