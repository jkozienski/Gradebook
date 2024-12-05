/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import lombok.*;

/**
 * Represents a student with first name,last name,student ID, and a list of grades.
 * @author Jakub 
 * @version 1.0
 */
@Getter
public class Student {

    /**
     * First name of the student
     */
    private String firstName;

    /**
     * Last name of the student
     */
    private String lastName;

    /**
     * Unique identifier for the student
     */
    private int studentId;

    /**
     * List of grades granted for the student
     */
    private List<Grade> grades;

    /**
     * Constructs a new Student with  first name, last name, and ID.
     * Initializes an empty list of grades.
     *
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param studentId the unique identifier for the student
     */
    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }
    

    /**
     * Adds a new grade to the student's list of grades
     *
     * @param grade the grade to be added
     */
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

/**
 * Calculates the weighted average grade for the student.
 * Returns 0 if the student has no grades.
 *
 * @return the calculated weighted average grade
 */
public double calculateAverageGrade() {
    if (grades.isEmpty()) {
        return 0;
    }
    double weightedSum = 0;
    int totalWeight = 0;
    
    for (Grade grade : grades) {
        int weight = 1; // Default grade weight
        if (grade instanceof ExamGrade) {
            weight = ((ExamGrade) grade).getWeight();
        } else if (grade instanceof AssignmentGrade) {
            weight = ((AssignmentGrade) grade).getWeight();
        }
        weightedSum += grade.getValue() * weight;
        totalWeight += weight;
    }
    
   double average = (totalWeight == 0 ? 0 : weightedSum / totalWeight);
   BigDecimal roundedAverage = new BigDecimal(average).setScale(2, RoundingMode.HALF_EVEN);

   return roundedAverage.doubleValue();
}


/**
     * Provides a string representation of the student, including their ID, name, and average grade.
     *
     * @return formatted string describing the student
     */
    @Override
    public String toString() {
        return "ID: " + studentId + ", Imie: " + firstName + ", Nazwisko: " + lastName + ", srednia: " + calculateAverageGrade();
    }
}
