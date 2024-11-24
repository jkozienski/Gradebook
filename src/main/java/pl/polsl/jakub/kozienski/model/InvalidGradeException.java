/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.model;

/**
 * Custom exception for handling invalid grade values in the Gradebook.
 * Thrown when a grade value is outside the acceptable range.
 * 
 * @version 1.0
 */
public class InvalidGradeException extends Exception {

    /**
     * Constructs an InvalidGradeException with a specified error message.
     * 
     * @param message description of the exception cause
     */
    public InvalidGradeException(String message) {
        super(message);
    }
}