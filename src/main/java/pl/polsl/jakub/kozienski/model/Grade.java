/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.model;
import lombok.*;

/**
 *
 * @author Jakub Kozienski
 * @version 1.0
 *
 * Represents a grade received by a student in a specific subject
 */
@Getter
public class Grade {

    /**
     * Subject for which the grade is given.
     */
    private String subject;

    /**
     * Numeric value of the grade.
     */
    private double value;

    /**
     * Date when the grade was added.
     */
    private String submissionDate;

    /**
     * Constructs a new Grade object with a specified subject value and date.
     * The exception validates that the grade value is between 1.0 and 6.0.
     *
     * @param subject the subject for which the grade is added
     * @param value the value of a grade
     * @throws InvalidGradeException if the grade value is outside the valid
     * range
     */
    public Grade(String subject, double value, String submissionDate) throws InvalidGradeException {
        if (value < 1.0 || value > 6.0) {
            throw new InvalidGradeException("Ocena moze wynosic miedzy 1.0 a 6.0!");
        }
        this.subject = subject;
        this.value = value;
        this.submissionDate = submissionDate;
    }


    /**
     * Provides a string representation of the grade including subject, value,
     * and date
     *
     * @return formatted string describing the grade
     */
    @Override
    public String toString() {
        return "Ocena: " + value + " Przedmiot: " + subject + ", Data oddania: " + submissionDate;
    }
}
