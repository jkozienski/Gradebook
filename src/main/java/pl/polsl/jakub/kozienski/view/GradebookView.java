/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jakub.kozienski.view;
import pl.polsl.jakub.kozienski.model.*;

/**
 *
 * @author Jakub Kozienski
 * @version 1.0
 *
 * View class responsible for displaying data and messages for the Gradebook
 * system. Provides methods to display messages and interact with the user.
 */
public class GradebookView {

    /**
     * Reference to the Gradebook model, containing student and grade data
     */
    private GradebookModel model;

    /**
     * Displays menu in the console
     */
    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Dodaj ocene z egzaminu");
        System.out.println("3. Dodaj ocene z zadania");
        System.out.println("4. Usun studenta");
        System.out.println("5. Wyswietl wszystkich studentow");
        System.out.println("6. Wyswietl srednia studenta");
        System.out.println("7. Wyswietl zadania studenta");
        System.out.println("8. Wyjdz");
        System.out.print("Wybierz opcje: ");
    }

    /**
     * Constructs a GradebookView with a reference to the Gradebook model
     *
     * @param model reference to the Gradebook object for retrieving data
     */
    public GradebookView(GradebookModel model) {
        this.model = model;
    }

    /**
     * Displays a general message to the user
     *
     * @param message the message to be displayed
     */
    public void displayMessage(String message) {
        System.out.println(message);
    }

    /**
     * Displays an error messeage to the user
     *
     * @param error the error message to be displayed
     */
    public void displayError(String error) {
        System.err.println(error);
    }

    /**
     * Displays averrage grade for the student
     *
     * @param firstName the firs tname of the student
     * @param lastName the last name of the student
     * @param average the calculated average grade of the student
     *
     */
    public void displayAverageGrade(String firstName, String lastName, double average) {
        System.out.println("\nSrednia ocen studenta " + firstName + " " + lastName + ": " + average);
    }
}
